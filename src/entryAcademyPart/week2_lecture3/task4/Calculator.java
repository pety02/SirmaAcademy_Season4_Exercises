package entryAcademyPart.week2_lecture3.task4;

import java.util.Scanner;

public class Calculator {
    private static int calculate(String operation, int left, int right) throws Exception {
        return switch (operation) {
            case "add" -> left + right;
            case "subtract" -> left - right;
            case "multiply" -> left * right;
            case "divide" -> left / right;
            default -> throw new Exception("Invalid operation!");
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int left = Integer.parseInt(scanner.nextLine());
        int right = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println(calculate(operation, left, right));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}