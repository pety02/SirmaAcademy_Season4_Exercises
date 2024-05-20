package entryAcademyPart.week2_lecture1.task2;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        final String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        int dayNo = Integer.parseInt(scanner.nextLine());
        if (dayNo < 1 || 7 < dayNo) {
            System.out.println("Invalid day!");
            return;
        }
        System.out.println(days[dayNo - 1]);
    }
}