package entryAcademyPart.week2_lecture3.task10;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    private static int multiply(int number) {
        int evensSum = 0;
        int oddsSum = 0;
        String num = number + "";
        while (0 < number) {
            int currentDigit = number % 10;
            if(currentDigit % 2 == 0) {
                evensSum += currentDigit;
            } else {
                oddsSum += currentDigit;
            }
            number /= 10;
        }

        return evensSum * oddsSum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(multiply(number));
    }
}