package entryAcademyPart.week1_lecture2.task20;

import java.util.Scanner;

public class DaysInMonth {
    private static int countDaysInMonth(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            default -> 30;
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        do {
            month = Integer.parseInt(scanner.nextLine());
        } while(month < 1 || 12 < month);
        System.out.printf("%d", countDaysInMonth(month));

    }
}