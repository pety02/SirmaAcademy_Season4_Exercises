package entryAcademyPart.week3_lecture1.task4;

import java.util.Scanner;
import java.util.Stack;

public class SimpleCalculator {
    private static boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }

    private static int reverseNumber(String number) {
        int num = Integer.parseInt(number);
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(num % 10);
            num /= 10;
        }
        return Integer.parseInt(sb.toString());
    }

    private static int calculate(int left, int right, char operator) throws Exception {
        return switch (operator) {
            case '+' -> left + right;
            case '-' -> left - right;
            default -> throw new Exception("Unknown operator");
        };
    }

    private static int execute(Stack<Character> operators, Stack<Integer> operands) {
        int result = 0;
        int left = 0, right = operands.pop();
        while(!operators.empty() && !operands.empty()) {
            left = operands.pop();
            char operator = operators.pop();
            try {
                result = calculate(left, right, operator);
                right = result;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder number = new StringBuilder();
        int power = 0;
        Stack<Character> operators = new Stack<>();
        Stack<Integer> operands = new Stack<>();
        for (int i = 0; i < input.length() - 1; i++) {
            if(input.charAt(i) == '+' || input.charAt(i) == '-') {
                operators.push(input.charAt(i));
            } else if (isDigit(input.charAt(i)) && isDigit(input.charAt(i + 1))) {
                number.append((int) (((input.charAt(i)) - '0') * Math.pow(10, power++)));
            } else if (isDigit(input.charAt(i)) && input.charAt(i + 1) == ' ') {
                number.append((int) (((input.charAt(i)) - '0') * Math.pow(10, power++)));
                operands.push(Integer.parseInt(number.toString()));
                number = new StringBuilder();
                power = 0;
            } else if (input.charAt(i) == ' ') {
                continue;
            } else {
                System.out.println("Invalid expression!");
                break;
            }
        }
        if(isDigit(input.charAt(input.length() - 1))) {
            number.append((int) (((input.charAt(input.length() - 1)) - '0') * Math.pow(10, power++)));
            operands.push(Integer.parseInt(number.toString()));
        }

        int result = execute(operators, operands);
        System.out.println(result);
    }
}