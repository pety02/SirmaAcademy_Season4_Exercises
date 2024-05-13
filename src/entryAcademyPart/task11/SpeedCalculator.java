package entryAcademyPart.task11;

import java.util.Scanner;

public class SpeedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInMeters = scanner.nextInt();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        int realMinutes = (hours + (minutes / 60)) * 60 + (minutes % 60);
        double realTimeInSeconds = 0.0 + (realMinutes * 60 + seconds);
        double velocity = distanceInMeters / realTimeInSeconds;
        System.out.println(velocity);
    }
}
