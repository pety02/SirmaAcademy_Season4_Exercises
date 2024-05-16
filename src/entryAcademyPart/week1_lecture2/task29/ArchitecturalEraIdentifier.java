package entryAcademyPart.week1_lecture2.task29;

import java.util.Scanner;

public class ArchitecturalEraIdentifier {
    private static String identify(int year, String material) {
        if(year <= 500 && material.equals("stone")) {
            return "Ancient";
        } else if (500 < year && year <= 1500 && material.equals("stone")) {
            return "Medieval";
        } else if (1500 < year && year <= 1800 && material.equals("wood")) {
            return "Colonial";
        } else if (1800 < year && year <= 1900 && material.equals("steel")) {
            return "Industrial";
        } else if (1900 < year && material.equals("steel")) {
            return "Modern";
        } else {
            return "Uncertain";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        do {
            year = Integer.parseInt(scanner.nextLine());
        } while (year < 0);

        String material;
        do {
            material = scanner.nextLine();
        } while (!material.equals("wood") && !material.equals("stone")
                && !material.equals("steel"));

        System.out.println(identify(year, material));
    }
}