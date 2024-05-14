package entryAcademyPart.week1_lecture1.task18;

import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInKilometers = scanner.nextInt();
        int timeInHours = scanner.nextInt();
        double averageSpeed = ((double) distanceInKilometers / timeInHours);
        System.out.printf("%.2f", averageSpeed);
    }
}