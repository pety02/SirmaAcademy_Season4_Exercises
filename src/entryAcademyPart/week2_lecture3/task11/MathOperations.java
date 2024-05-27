package entryAcademyPart.week2_lecture3.task11;

import java.util.Scanner;

public class MathOperations {
    private static int calculate(int left, char operator, int right) throws Exception {
        return switch (operator) {
            case '+' -> left + right;
            case '-' -> left - right;
            case '*' -> left * right;
            case '/' -> left / right;
            default -> throw new Exception("Invalid operator");
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = Integer.parseInt(scanner.next());
        char operator = scanner.next().charAt(0);
        int right = Integer.parseInt(scanner.next());
        try {
            System.out.println(calculate(left, operator, right));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}