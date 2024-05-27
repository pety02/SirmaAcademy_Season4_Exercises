package entryAcademyPart.week2_lecture3.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    private static final Map<String, Double> prices = new HashMap<>();
    static {
        prices.put("coffee", 1.50);
        prices.put("water", 1.00);
        prices.put("coke", 1.40);
        prices.put("snacks", 2.00);
    }
    private static double totalPrice(String product, int count) throws Exception {
        if(!product.equals("coffee") && !product.equals("water") && !product.equals("coke") && !product.equals("snacks")) {
            throw new Exception("Unknown product");
        }
        if(count <= 0) {
            return 0.0;
        }
        return prices.get(product) * count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println(totalPrice(product, count));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}