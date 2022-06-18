package salary;
public class Solution {
    public static void main(String args[]) {
      //给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
      Income[] incomes = new Income[] {
          new Income(300),
          new Salary(7500),
          new SpecialAllowance(15000)
      };

      System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for(Income income : incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

class Income {
    /** 税前收入，父类定义 */
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1;    //税率10%
    }
}

class Salary extends Income {
    // 不能在此处定义income变量，否则变量会被遮蔽

    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if(income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class SpecialAllowance extends Income {
    public SpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}