package staticD;

public class FirstSample {

    {
        System.out.println("构造代码块");
    }
    static {
        System.out.println("静态代码块");
    }
    public FirstSample() {
        System.out.println("构造器");
    }
    public static void main(String[] args) {
        System.out.println("主方法");
        new FirstSample();
        new FirstSample();
    }
}