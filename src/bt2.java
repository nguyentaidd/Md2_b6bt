import bt2.Point2D;
import bt2.Point3D;

public class bt2 {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3.4f,6.7f);
        System.out.println(point2D);
        System.out.println(".......");
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(5.4f,1.2f,4.5f);
        System.out.println(point3D);
    }
}