package triangle;
import static java.lang.Math.*;

public class TriangleEdge {

    public double baseEdge;

    //自动生成的getter和setter，其他属性比照定义 #region
    public double getBaseEdge() {
        return baseEdge;
    }

    public void setBaseEdge(double baseEdge) {
        this.baseEdge = baseEdge;
    }
    //#endregion

    public double secondEdge;

    public double thirdEdge;

    public TriangleEdge() {
        this.baseEdge = 3;
        this.secondEdge = 4;
        this.thirdEdge = 5;
    }

    public TriangleEdge(double edgeIn1) {
        this.baseEdge = 3;
        this.secondEdge = 4;
        this.thirdEdge = edgeIn1;
    }

    public static TriangleEdge triangleFromEdge(double edgeIn1,double edgeIn2) {
        TriangleEdge triangle = new TriangleEdge();
        triangle.secondEdge = edgeIn1;
        triangle.thirdEdge = edgeIn2;
        return triangle;
    }

    public static TriangleEdge acuteTriangleFromHeightEdge(double edgeIn,double heightIn) {
        TriangleEdge triangle = new TriangleEdge();
        triangle.secondEdge = edgeIn;
        double angle3 = asin(heightIn/edgeIn);
        triangle.thirdEdge = CosineLaw(triangle.baseEdge,triangle.secondEdge,angle3);
        return triangle;
    }

    public double area(){
        return HeronFormula(this.baseEdge, this.secondEdge, this.thirdEdge);
    }

    /** 手动定义getter方法 */
    public double getArea(){
        return area();
    }
    
    /** 作业不需要实现此方法 */
    @Override
    public String toString() {
        return "TriangleEdge [edge1=" + baseEdge + ", edge2=" + secondEdge + ", edge3=" + thirdEdge + "]";
    }

    private static double HeronFormula(double a,double b,double c){
        double p= (a + b + c)/2;
        return sqrt(p * (p-a) * (p-b) * (p-c));
    }
    
    private static double CosineLaw(double a,double b,double Cangle){
        return sqrt(a*a + b*b - 2*a*b*Math.cos(Cangle));
    }
}