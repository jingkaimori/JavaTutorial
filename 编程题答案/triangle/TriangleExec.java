package triangle;

/**
 * 此处省略用户输入检查。getter和setter的自动生成参考{@link TriangleEdge}类
 */
public class TriangleExec {
    public static void main(String[] args) {
        noArg();
        oneArg();
        twoEdge();
        edgeHeight();
    }

    public static void noArg() {
        TriangleEdge triangle = new TriangleEdge();
        System.out.println(triangle.toString());
        System.out.println(triangle.area());
    }
    public static void oneArg() {
        TriangleEdge triangle = new TriangleEdge(6);
        System.out.println(triangle.toString());
        System.out.println(triangle.area());
    }
    public static void twoEdge() {
        TriangleEdge triangle = TriangleEdge.triangleFromEdge(4,6);
        System.out.println(triangle.toString());
        System.out.println(triangle.area());
    }
    public static void edgeHeight() {
        TriangleEdge triangle = TriangleEdge.acuteTriangleFromHeightEdge(4,4);
        System.out.println(triangle.toString());
        System.out.println(triangle.area());
    }
}
