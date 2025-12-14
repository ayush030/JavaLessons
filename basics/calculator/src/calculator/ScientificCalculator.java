package calculator;

import java.util.Scanner;

public class ScientificCalculator extends Calculator {
    @Override
    public float divide(float operand1, float operand2) throws ArithmeticException {
        if(operand2 == 0) {
            throw new ArithmeticException("divide by zero not allowed!");
        }

        return super.divide(operand1, operand2);
    }

    public void operations() {
        System.out.println("1. Addition \n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponent");
    }

    public double exponent(float operand1, float operand2) {
        if (operand2 == 0) {
            return 1;
        }

        if (operand1 == 0 || operand1 == 1) {
            return operand1;
        }

        return Math.pow(operand1, operand2);
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
                    System.out.println("Answer is: " + this.add(operand1, operand2));
                    break;

                case 2:
                    System.out.println("Answer is: " + this.sub(operand1, operand2));
                    break;

                case 3:
                    System.out.println("Answer is: " + this.multiply(operand1, operand2));
                    break;

                case 4:
                    System.out.println("Answer is: " + this.divide(operand1, operand2));
                    break;

                case 5:
                    System.out.println("Answer is: " + this.exponent(operand1, operand2));
                    break;

                default:
                    System.out.println("Invalid operation!");
                    break CALCULATE;
            }
        }
    }
}