package myAbstractClasses;

public class Rectangle implements Calculator{
    @Override
    public int add(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) * 2;
    }

    @Override
    public int subtract(int firstNumber, int secondNumber) {
        return 0;
    }
}
