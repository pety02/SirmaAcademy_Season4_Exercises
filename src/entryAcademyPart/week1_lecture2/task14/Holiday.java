package entryAcademyPart.week1_lecture2.task14;

import java.util.Scanner;

public class Holiday {
    private static String determinePlace(double budget) {
        if(10.00 <= budget && budget <= 100.0) {
            return "Bulgaria";
        } else if (100.0 < budget && budget <= 1000.0) {
            return "Europe";
        } else if (1000.0 < budget) {
            return "Asia";
        } else {
            return "";
        }
    }
    private static String determineVacation(String place, String season) {
        if(place.equals("Asia")) {
            return "Hotel";
        }
        if(season.equals("summer")) {
            return "Camp";
        } else if (season.equals("winter")) {
            return "Hotel";
        } else {
            return "";
        }
    }
    private static double calculateBudget(double budget, String place, String season) {
        return switch (place) {
            case "Bulgaria" -> switch (season) {
                case "summer" -> 0.3 * budget;
                case "winter" -> 0.7 * budget;
                default -> -1.0;
            };
            case "Europe" -> switch (season) {
                case "summer" -> 0.4 * budget;
                case "winter" -> 0.8 * budget;
                default -> -1.0;
            };
            case "Asia" -> 0.9 * budget;
            default -> -1.0;
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget;
        do{
            budget = Double.parseDouble(scanner.nextLine());
        } while(budget < 10.00 || 5000.0 < budget);

        String season;
        do{
            season = scanner.nextLine();
        } while (!season.equals("winter") && !season.equals("summer"));

        String place = determinePlace(budget);
        String typeVacation = determineVacation(place,  season);
        double spentMoney = calculateBudget(budget, place, season);
        System.out.printf("Somewhere in %s%n%s - %.2f", place, typeVacation, spentMoney);
    }
}