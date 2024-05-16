package entryAcademyPart.week1_lecture2.task25;

import java.util.Scanner;

public class AdventureGame {
    private static String choosePath(String inLeftHand, String inRightHand) {
        if((inLeftHand.equals("sword") && inRightHand.equals("shield"))
                || (inLeftHand.equals("shield") && inRightHand.equals("sword"))) {
            return "Path to the castle";
        } else if ((!inLeftHand.equals("sword") && !inRightHand.equals("shield"))
            || (!inRightHand.equals("sword") && !inLeftHand.equals("shield"))) {
            if((inLeftHand.equals("map") && inRightHand.equals("coins"))
                    || (inLeftHand.equals("coins") && inRightHand.equals("map"))) {
                return "Go to the town";
            } else if ((!inLeftHand.equals("map") && !inRightHand.equals("coins"))
                    || (!inRightHand.equals("map") && !inLeftHand.equals("coins"))) {
                return "Camp";
            }
            return "Path to the forest";
        } else {
            return "Wander aimlessly";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inLeftHand = scanner.nextLine();
        String inRightHand = scanner.nextLine();

        System.out.println(choosePath(inLeftHand, inRightHand));
        // Maybe, there are some incorrect outputs
    }
}