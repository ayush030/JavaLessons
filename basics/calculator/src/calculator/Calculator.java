package calculator;

public abstract class Calculator {
    // non-abstract methods
    public float add(float operand1, float operand2) {
        return operand1 + operand2;
    }

    public float sub(float operand1, float operand2) {
        return operand1 - operand2;
    }

    public float multiply(float operand1, float operand2) {
        return operand1 * operand2;
    }

    public float divide(float operand1, float operand2) {
        return operand1 / operand2;
    }

    // abstract methods
    public abstract void operations();
    public abstract void calculate();
}