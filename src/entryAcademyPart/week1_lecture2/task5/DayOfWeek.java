package entryAcademyPart.week1_lecture2.task5;

import java.util.Scanner;

public class DayOfWeek {
    final static String[] days = new String[]{"Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = Integer.parseInt(scanner.nextLine());
        if(dayNumber < 1 || days.length < dayNumber) {
            System.out.println("Error");
        }
        for(int i = 1; i <= days.length; ++i) {
            if(dayNumber == i) {
                System.out.println(days[i - 1]);
                return;
            }
        }
    }
}