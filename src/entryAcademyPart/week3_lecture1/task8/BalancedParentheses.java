package entryAcademyPart.week3_lecture1.task8;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    private static boolean checkBalancedParentheses(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string of brackets:");
        String input = scanner.nextLine();
        boolean isBalanced = checkBalancedParentheses(input);

        System.out.println(isBalanced);
    }
}