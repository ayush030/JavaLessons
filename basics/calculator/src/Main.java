package main;

import calculator.Calculator;
import calculator.BasicCalculator;
import calculator.ScientificCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("\t\tCalculator app! \nChoose your calculator:");
            System.out.println("Basic calculator (enter 1)");
            System.out.println("Scientific calculator (enter 2)");
            System.out.println("Exit (enter 3)");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter option:");
            int calOption = scanner.nextInt();

            Calculator cal;

            switch (calOption) {
                case 1:
                    cal = new BasicCalculator();
                    break;
                case 2:
                    cal = new ScientificCalculator();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid selection!");
                    continue;
            }

            cal.calculate();
        }
    }
}