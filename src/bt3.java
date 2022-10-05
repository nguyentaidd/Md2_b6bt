import bt3.Point;
import bt3.MoveablePoint;

public class bt3 {
    public static void main(String[] args) {
        Point point=new Point(3,4);
        System.out.println(point);
        MoveablePoint moveablePoint=new MoveablePoint(3,4,5,5);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
