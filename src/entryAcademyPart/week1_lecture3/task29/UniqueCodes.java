package entryAcademyPart.week1_lecture3.task29;

import java.util.Scanner;

public class UniqueCodes {
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        final int downLimitOfAllDigits = 1;
        Scanner scanner = new Scanner(System.in);
        int upperLimitOfFirstDigit;
        do {
            upperLimitOfFirstDigit = Integer.parseInt(scanner.nextLine());
        } while (upperLimitOfFirstDigit < 1 || 9 < upperLimitOfFirstDigit);

        int upperLimitOfSecondDigit;
        do {
            upperLimitOfSecondDigit = Integer.parseInt(scanner.nextLine());
        } while (upperLimitOfSecondDigit < 1 || 9 < upperLimitOfSecondDigit);

        int upperLimitOfThirdDigit;
        do {
            upperLimitOfThirdDigit = Integer.parseInt(scanner.nextLine());
        } while (upperLimitOfThirdDigit < 1 || 9 < upperLimitOfThirdDigit);
        for (int fd = downLimitOfAllDigits; fd <= upperLimitOfFirstDigit; fd++) {
            for (int sd = downLimitOfAllDigits; sd <= upperLimitOfSecondDigit; sd++) {
                for (int td = downLimitOfAllDigits; td <= upperLimitOfThirdDigit; td++) {
                    if(fd % 2 == 0 && (2 <= sd && sd <= 7 && isPrime(sd)) && td % 2 == 0) {
                        System.out.println(fd + " " + sd + " " + td);
                    }
                }
            }
        }
    }
}