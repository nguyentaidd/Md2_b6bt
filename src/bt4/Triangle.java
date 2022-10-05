package bt4;

public class Triangle extends Shape{
    private double size1;
    private double size2;
    private double size3;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getArea(){
        return Math.pow((size1+size2+size3)*(size1+size2-size3)*(size3+size2-size1)*(size1+size3-size2)/4,0.5);
    }
    public double getPerimeter(){
        return (size1+size2+size3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                ", size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 +
                ", S=" + getArea() +
                ", P=" + getPerimeter() +
                '}';
    }
}
