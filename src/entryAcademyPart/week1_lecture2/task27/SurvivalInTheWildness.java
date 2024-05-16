package entryAcademyPart.week1_lecture2.task27;

import java.util.Scanner;

public class SurvivalInTheWildness {
    private static String decideAction(String timeOfDay, String environment, String item) {
        if (timeOfDay.equals("day")) {
            if (environment.equals("forest")) {
                if (item.equals("knife")) {
                    return "Hunt for food";
                } else if (item.equals("container")) {
                    return "Collect berries";
                } else {
                    return "Explore";
                }
            } else if (environment.equals("desert")) {
                if (item.equals("hat")) {
                    return "Search for water";
                } else {
                    return "Find shade";
                }
            }
        } else if (timeOfDay.equals("night")) {
            if (environment.equals("forest")) {
                if (item.equals("firestarter")) {
                    return "Make a campfire";
                } else {
                    return "Climb a tree for safety";
                }
            } else if (environment.equals("desert")) {
                if (item.equals("blanket")) {
                    return "Sleep";
                } else {
                    return "Keep moving to stay warm";
                }
            }
        }
        return "No action decided";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeOfDay = scanner.nextLine();
        String environment = scanner.nextLine();
        String item = scanner.nextLine();

        String action = decideAction(timeOfDay, environment, item);

        System.out.println(action);
    }
}