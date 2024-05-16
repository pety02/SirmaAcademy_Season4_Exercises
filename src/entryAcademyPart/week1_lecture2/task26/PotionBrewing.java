package entryAcademyPart.week1_lecture2.task26;

import java.util.Scanner;

public class PotionBrewing {
    private static String brewPotion(String[] ingredients) {
        if (containsIngredient(ingredients, "herbs")) {
            if (containsIngredient(ingredients, "water")) {
                return "Health potion";
            } else if (containsIngredient(ingredients, "oil")) {
                return "Stealth potion";
            } else {
                return "Minor stamina potion";
            }
        } else if (containsIngredient(ingredients, "berries")) {
            if (containsIngredient(ingredients, "sugar")) {
                return "Speed potion";
            } else {
                return "Minor energy potion";
            }
        } else {
            return null;
        }
    }

    private static boolean containsIngredient(String[] ingredients, String ingredient) {
        for (String ing : ingredients) {
            if (ing.equals(ingredient)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstIngredient = scanner.nextLine();
        String secondIngredient = scanner.nextLine();
        String[] playerIngredients = {firstIngredient, secondIngredient};

        String potion = brewPotion(playerIngredients);

        if (potion != null) {
            System.out.println(potion);
        } else {
            System.out.println("No potion");
        }
    }
}