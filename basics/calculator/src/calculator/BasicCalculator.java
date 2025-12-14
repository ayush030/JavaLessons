package calculator;

import java.lang.ArithmeticException;
import java.util.Scanner;

public class BasicCalculator extends Calculator{
    @Override
    public float divide(float operand1, float operand2) throws ArithmeticException {
        if(operand2 == 0) {
            throw new ArithmeticException("divide by zero not allowed!");
        }

        return super.divide(operand1, operand2);
    }

    public void operations() {
        System.out.println("1. Addition \n2. Subtraction\n3. Multiplication\n4. Division");
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        CALCULATE:
        while(true) {
            this.operations();

            System.out.print("Enter operand1: ");
            float operand1 = scanner.nextFloat();

            System.out.print("Enter operand2: ");
            float operand2 = scanner.nextFloat();

            System.out.print("Select operation: ");
            int operation = scanner.nextInt();

            float answer;

            switch (operation) {
                case 1:
                    answer = this.add(operand1, operand2);
                    break;

                case 2:
                    answer = this.sub(operand1, operand2);
                    break;

                case 3:
                    answer = this.multiply(operand1, operand2);
                    break;

                case 4:
                    answer = this.divide(operand1, operand2);
                    break;

                default:
                    System.out.println("Invalid operation!");
                    break CALCULATE;
            }

            System.out.println("Answer is: " + answer);
        }
    }
}