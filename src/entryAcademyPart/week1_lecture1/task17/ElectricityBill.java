package entryAcademyPart.week1_lecture1.task17;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitsConsumed = scanner.nextInt();
        double ratePerUnit = scanner.nextDouble();
        final int fixedCharge = 10;
        double totalBill = unitsConsumed * ratePerUnit + fixedCharge;
        System.out.printf("%.2f", totalBill);

        // The last output should be 175.00 not 175.
    }
}