package myAbstractClasses;

public abstract class GeometricObject {
    private java.util.Date date;

    protected GeometricObject() {
        date = new java.util.Date();
        System.out.println("geo cobstructor");
    }

    public java.util.Date getDate() {
        return date;
    }
    public abstract double getArea(int length, int breadth);

}
