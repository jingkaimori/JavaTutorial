package triangle;
import static java.lang.Math.*;

/**
 * 第三边的getter方法略
 */
public class TriangleHeight {

    public double baseEdge;

    public double secondEdge;

    public double area;

    public TriangleHeight() {
        this.baseEdge = 3;
        this.secondEdge = 4;
        this.area = 6;
    }

    public TriangleHeight(double edgeIn1) {
        this.baseEdge = 3;
        this.secondEdge = 4;
        this.area = HeronFormula(this.baseEdge, this.secondEdge, edgeIn1);
    }

    public static TriangleHeight triangleFromEdge(double edgeIn1,double edgeIn2) {
        TriangleHeight triangle = new TriangleHeight();
        triangle.secondEdge = edgeIn1;
        triangle.area = HeronFormula(triangle.baseEdge, triangle.secondEdge, edgeIn2);
        return triangle;
    }

    public static TriangleHeight acuteTriangleFromHeightEdge(double edgeIn,double heightIn) {
        TriangleHeight triangle = new TriangleHeight();
        triangle.secondEdge = edgeIn;
        triangle.area = heightIn * triangle.baseEdge;
        return triangle;
    }

    public double area(){
        return this.area;
    }

    
    /** 作业不需要实现此方法 */
    @Override
    public String toString() {
        return "TriangleHeight [edge1=" + baseEdge + ", edge2=" + secondEdge + ", area=" + area + "]";
    }

    private static double HeronFormula(double a,double b,double c){
        double p= (a + b + c)/2;
        return sqrt(p * (p-a) * (p-b) * (p-c));
    }
}