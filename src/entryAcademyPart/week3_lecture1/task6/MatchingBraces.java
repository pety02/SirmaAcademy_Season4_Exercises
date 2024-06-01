package entryAcademyPart.week3_lecture1.task6;

import java.util.Stack;

public class MatchingBraces {
    private static void extractAndPrintSubExpressions(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                int startIndex = stack.pop();
                String subExpression = expression.substring(startIndex, i + 1);
                System.out.println(subExpression);
            }
        }
    }

    public static void main(String[] args) {
        String expression1 = "1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5";
        String expression2 = "(2 + 3) - (2 + 3)";

        System.out.println("Expression 1: " + expression1);
        extractAndPrintSubExpressions(expression1);
        System.out.println();
        System.out.println("Expression 2: " + expression2);
        extractAndPrintSubExpressions(expression2);
    }
}