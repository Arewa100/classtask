package myAbstractClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometricObjectTest {
    @Test
    public void testToCalculateTheAreaOfATriangle() {
        Triangle triangle = new Triangle();
        double result = triangle.getArea(2, 5);
        assertEquals(10.0, result);
    }

    @Test
    public void testThatTheAbstractCanBeUsedAsADataTypeOfTheSubClass() {
        GeometricObject triangle = new Triangle();
        System.out.println(triangle.getClass().getSimpleName());
        double resultArea = triangle.getArea(2, 5);
        assertEquals(10.0, resultArea);
    }

    @Test
    public void testToCreateAnArrayTypeOfAbstractClass() {
        GeometricObject[] triangle = new GeometricObject[3];
        triangle[0] = new Triangle();
        triangle[1] = new Triangle();
        triangle[2] = new Triangle();

    }

    @Test
    public void testToGetTheDateWhenTheGeometricObjectWasCreated() {
        Triangle triangle = new Triangle();
        System.out.println(triangle.getDate());

    }

    @Test
    public void test_To_Implement_An_Interface_ForCalculating_Area_Of_A_Circle() {
        Calculator calculator = new Circle();
        assertEquals(6, calculator.add(2, 4));
        System.out.print(calculator.getClass().getSimpleName());
    }
    @Test
    public void test_To_Implement_An_Interface_ForCalculating_Area_Of_A_Rectangle() {
        Calculator calculator = new Rectangle();
        assertEquals(16, calculator.add(4, 4));
        System.out.print(calculator.getClass().getSimpleName());
    }

}
