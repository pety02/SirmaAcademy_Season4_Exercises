package entryAcademyPart.week1_lecture2.task10;

import java.util.Scanner;

public class Grocery {
    private static final String[] products = {"tea", "water", "juice", "sweets", "chips"};
    private static final double[] pricesInSofia = new double[]{0.50, 0.80, 1.20, 1.45, 1.60};
    private static final double[] pricesInPlovdiv = new double[]{0.40, 0.70, 1.15, 1.30, 1.50};
    private static final double[] pricesInVarna = new double[]{0.45, 0.70, 1.10, 1.35, 1.55};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productName;
        do {
            productName = scanner.nextLine();
        } while (!productName.equals("tea") && !productName.equals("water") && !productName.equals("juice")
                && !productName.equals("sweets") && !productName.equals("chips"));

        String cityName;
        do {
            cityName = scanner.nextLine();
        } while (!cityName.equals("Sofia") && !cityName.equals("Plovdiv") && !cityName.equals("Varna"));

        int productNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.length; ++i) {
            if (cityName.equals("Sofia") && productName.equals(products[i])) {
                System.out.printf("%.2f", pricesInSofia[i] * productNumber);
            } else if (cityName.equals("Plovdiv") && productName.equals(products[i])) {
                System.out.printf("%.2f", pricesInPlovdiv[i] * productNumber);
            } else if (cityName.equals("Varna") && productName.equals(products[i])) {
                System.out.printf("%.2f", pricesInVarna[i] * productNumber);
            }
        }
    }
}