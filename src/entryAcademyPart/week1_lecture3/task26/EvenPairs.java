package entryAcademyPart.week1_lecture3.task26;

import java.util.Scanner;

public class EvenPairs {
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
        Scanner scanner = new Scanner(System.in);

        int initialFirstPair;
        do {
            initialFirstPair = Integer.parseInt(scanner.nextLine());
        } while (initialFirstPair < 10 || 90 < initialFirstPair);

        int initialSecondPair;
        do {
            initialSecondPair = Integer.parseInt(scanner.nextLine());
        } while (initialSecondPair < 10 || 90 < initialSecondPair);

        int diffFirstPair;
        do {
            diffFirstPair = Integer.parseInt(scanner.nextLine());
        } while (diffFirstPair < 1 || 9 < diffFirstPair);

        int diffSecondPair;
        do {
            diffSecondPair = Integer.parseInt(scanner.nextLine());
        } while (diffSecondPair < 1 || 9 < diffSecondPair);

        int finalFirstPair = initialFirstPair + diffFirstPair;
        int finalSecondPair = initialSecondPair + diffSecondPair;

        for (int firstPair = initialFirstPair; firstPair <= finalFirstPair; firstPair++) {
            for (int secondPair = initialSecondPair; secondPair <= finalSecondPair; secondPair++) {
                if (isPrime(firstPair) && isPrime(secondPair)) {
                    String fourDigitNumber = String.format("%02d%02d", firstPair, secondPair);
                    System.out.println(fourDigitNumber);
                }
            }
        }
    }
}