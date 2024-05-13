package entryAcademyPart.week1_lecture1.task10;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int hours = input / 60;
        int minutes = input % 60;
        LocalTime time = LocalTime.of(hours, minutes);

        // The task's description is incorrect. There is no HR:MM time format.
        // The correct time format is HH:mm
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm")));
    }
}