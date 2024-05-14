package entryAcademyPart.week1_lecture1.task16;

import java.util.Scanner;

public class WaterConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int daysInWeek = 7;
        double waterPerWeekInLitres = scanner.nextDouble();
        int personsNumber = scanner.nextInt();
        double waterPerDay = waterPerWeekInLitres / daysInWeek;
        double waterPerPerson = waterPerDay / personsNumber;
        System.out.printf("%.2f", waterPerPerson);
    }
}