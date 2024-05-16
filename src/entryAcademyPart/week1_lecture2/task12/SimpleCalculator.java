package entryAcademyPart.week1_lecture2.task12;

import java.util.Scanner;

public class SimpleCalculator {
    private static double calculate(double firstNumber, double secondNumber, String operation) {
        return switch(operation) {
            case "add" -> firstNumber + secondNumber;
            case "subtract" -> firstNumber - secondNumber;
            case "multiply" -> firstNumber * secondNumber;
            case "divide" -> firstNumber / secondNumber;
            default -> 0.0;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        System.out.printf("%.2f", calculate(firstNumber, secondNumber, operation));
    }
}