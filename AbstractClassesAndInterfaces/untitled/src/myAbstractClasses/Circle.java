package myAbstractClasses;

public class Circle implements Calculator{

    @Override
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public String name() {
        return "Circle";
    }
}
