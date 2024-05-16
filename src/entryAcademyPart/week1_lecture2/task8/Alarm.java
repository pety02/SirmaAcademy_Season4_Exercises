package entryAcademyPart.week1_lecture2.task8;

import java.util.Scanner;

public class Alarm {
    private static boolean validateHours(int hours) {
        return 0 <= hours && hours <= 23;
    }
    private static boolean validateMinutes(int minutes) {
        return 0 <= minutes && minutes <= 59;
    }
    private static void printTime(int hours, int minutes) {
        System.out.printf("%d:%02d", hours, minutes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours;
        do{
            hours = Integer.parseInt(scanner.nextLine());
        } while(!validateHours(hours));

        int minutes;
        do {
            minutes = Integer.parseInt(scanner.nextLine());
        } while(!validateMinutes(minutes));

        minutes += 15;
        if(minutes / 60 != 0) {
            hours += 1;
            minutes = minutes % 60;
        }

        if(hours / 24 != 0) {
            hours = hours % 24;
        }

        printTime(hours, minutes);
    }
}