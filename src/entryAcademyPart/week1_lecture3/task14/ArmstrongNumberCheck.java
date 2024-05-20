package entryAcademyPart.week1_lecture3.task14;

import java.util.Scanner;

public class ArmstrongNumberCheck {
    private static boolean isDigit(char symbol) {
        return '0' <= symbol && symbol <= '9';
    }
    private static int countDigits(String word) {
        int countDigits = 0;
        for (int i = 0; i < word.length(); i++) {
            if(isDigit(word.charAt(i))) {
                countDigits++;
            }
        }

        return countDigits;
    }

    private static int sumDigits(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if(isDigit(word.charAt(i))) {
                sum += (word.charAt(i) - '0');
            }
        }

        return sum;
    }
    private static boolean isArmstrongNumber(String word) {
        return Integer.parseInt(word) == Math.pow(sumDigits(word), countDigits(word));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(isArmstrongNumber(input));
        System.out.println(isArmstrongNumber(input) ?
                "Armstrong" : "Not Armstrong");
    }
}