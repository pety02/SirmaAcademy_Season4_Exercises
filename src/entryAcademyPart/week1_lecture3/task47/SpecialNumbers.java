package entryAcademyPart.week1_lecture3.task47;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialNumbers {
    private static ArrayList<Integer> findSpecialNumbers(int n) {
        ArrayList<Integer> specialNumbers = new ArrayList<>();
        for (int i = 1111; i <= 9999; i++) {
            if (isSpecialNumber(i, n)) {
                specialNumbers.add(i);
            }
        }
        return specialNumbers;
    }

    private static boolean isSpecialNumber(int number, int n) {
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0 || n % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> specialNumbers = findSpecialNumbers(n);
        for (int number : specialNumbers) {
            System.out.println(number);
        }
    }
}