package entryAcademyPart.week1_lecture1.task19;

import java.util.Scanner;

public class FuelEfficiency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInKilometers = scanner.nextInt();
        int fuelInLitres = scanner.nextInt();
        double fuelEfficiency = ((double) distanceInKilometers / fuelInLitres);
        System.out.printf("%.2f", fuelEfficiency);

        // the first output should be 12.50 and the second one should be 15.00 :)
    }
}