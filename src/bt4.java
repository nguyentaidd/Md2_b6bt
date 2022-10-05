import bt4.Shape;
import bt4.Triangle;
public class bt4 {
    public static void main(String[] args) {
        Shape shape=new Shape("red",true);
        System.out.println(shape);
        Triangle triangle=new Triangle("grenn",true,3,4,5);
        System.out.printf(triangle.toString());
    }
}
