package entryAcademyPart.week1_lecture2.task13;

import java.util.Scanner;

public class VegetableMarket {
    private static final String[] vegetables = new String[]{"tomato", "onion", "lettuce", "cucumber", "pepper"};
    private static final double[] workingDaysPrices = new double[]{2.50, 1.20, 0.85, 1.45, 5.50};
    private static final double[] weekendPrices = new double[]{2.80, 1.30, 0.85, 1.75, 3.50};

    private static double calculatePrice(String vegetable, String dayOfTheWeek, int quantity) {
        double totalPrice = -1.0;

        for(int index = 0; index < vegetables.length; ++index) {
            if(vegetable.equals(vegetables[index])) {
                if(dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday")
                        || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday")) {
                    totalPrice = workingDaysPrices[index] * quantity;
                    break;
                } else if(dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
                    totalPrice = weekendPrices[index] * quantity;
                    break;
                }
            }
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vegetable = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double totalPrice = calculatePrice(vegetable, dayOfWeek, quantity);
        if(totalPrice != -1.0) {
            System.out.printf("%.2f", totalPrice);
        } else {
            System.out.println("error");
        }
    }
}