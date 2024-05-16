package entryAcademyPart.week1_lecture2.task16;

import java.util.Scanner;

public class AtSea {
    private static double calculateTotalPrice(int days, String type, String assessment) {
        double totalPrice;
        if (0 < days && days < 10) {
            totalPrice = (days - 1) * switch (type) {
                case "single room" -> 25.00;
                case "apartment" -> (0.7 * 50.00);
                case "presidential" -> (0.9 * 100.00);
                default -> 0.0;
            };
        } else if (10 <= days && days <= 15) {
            totalPrice = (days - 1) * switch (type) {
                case "single room" -> 25.00;
                case "apartment" -> (0.65 * 50.00);
                case "presidential" -> (0.85 * 100.00);
                default -> 0.0;
            };
        } else {
            totalPrice = (days - 1) * switch (type) {
                case "single room" -> 25.00;
                case "apartment" -> (0.5 * 50.00);
                case "presidential" -> (0.8 * 100.00);
                default -> 0.0;
            };
        }

        if(assessment.equals("positive")) {
            totalPrice *= 1.25;
        } else {
            totalPrice *= 0.9;
        }
        return totalPrice;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        do {
            days = Integer.parseInt(scanner.nextLine());
        } while (days < 0 || 365 < days);

        String type;
        do {
            type = scanner.nextLine();
        } while (!type.equals("single room") && !type.equals("apartment")
                && !type.equals("presidential"));

        String assessment;
        do {
            assessment = scanner.nextLine();
        } while (!assessment.equals("negative") && !assessment.equals("positive"));

        System.out.printf("%.2f", calculateTotalPrice(days, type, assessment));

        // the first given output is incorrect
    }
}