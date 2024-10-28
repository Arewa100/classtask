package myAbstractClasses;

public class Triangle extends GeometricObject{


    public Triangle() {
        super();
        System.out.println("Triangle constructor");
    }
    @Override
    public double getArea(int length, int breadth) {
        return length * breadth;
    }

    @Override
    public java.util.Date getDate() {
        return super.getDate();
    }
}
