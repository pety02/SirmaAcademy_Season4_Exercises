package entryAcademyPart.entry_exam;

import java.util.Scanner;
import java.util.Stack;

public class LegendaryDuels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<Character> strikes = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar == '(' || (currentChar == '!' && (strikes.empty() || strikes.peek() != '!')) || currentChar == '{') {
                strikes.push(currentChar);
            } else if((currentChar == ')' && strikes.peek() == '(')
                || (currentChar == '!' && strikes.peek() == '!')
                || (currentChar == '}' && strikes.peek() == '{')) {
                strikes.pop();
            }
        }

        if(strikes.empty()) {
            System.out.println("Legendary");
        } else {
            System.out.println("Not Legendary");
        }
    }
}