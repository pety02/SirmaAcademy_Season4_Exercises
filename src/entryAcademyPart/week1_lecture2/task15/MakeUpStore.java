package entryAcademyPart.week1_lecture2.task15;

import java.util.Scanner;

public class MakeUpStore {
    private static final double powderPrice = 2.60;
    private static final double lipstickPrice = 3.00;
    private static final double spiralPrice = 4.10;
    private static final double shadowPrice = 8.20;
    private static final double concealerPrice = 2.00;
    private static double validate(Scanner scanner) {
        double sum;
        do {
            sum = Double.parseDouble(scanner.nextLine());
        } while(sum < 1.0 || 10000.0 < sum);

        return sum;
    }
    private static int validateMakeUpCount(Scanner scanner) {
        int count;
        do {
            count = Integer.parseInt(scanner.nextLine());
        } while(count < 0 || 1000 < count);

        return count;
    }
    private static double calculateTotalPrice(double[] makeUpPrices) {
        double totalSum = 0.0;
        for(double price : makeUpPrices) {
            totalSum += price;
        }

        return totalSum;
    }
    private static double makeDiscount(int totalMakeUpCount, double totalPrice) {
        return (50 < totalMakeUpCount) ? totalPrice * 0.25 : 0.0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double renovationMoney = validate(scanner);

        int powdersCount = validateMakeUpCount(scanner);
        int lipsticksCount = validateMakeUpCount(scanner);
        int spiralsCount = validateMakeUpCount(scanner);
        int shadowsCount = validateMakeUpCount(scanner);
        int concealersCount = validateMakeUpCount(scanner);

        int makeupCount = powdersCount + lipsticksCount + spiralsCount + shadowsCount + concealersCount;
        double[] prices = new double[] {(powdersCount * powderPrice), (lipsticksCount * lipstickPrice),
                (spiralsCount * spiralPrice), (shadowsCount * shadowPrice), (concealersCount * concealerPrice)};
        double totalMakeUpPrice = calculateTotalPrice(prices);
        totalMakeUpPrice -= makeDiscount(makeupCount, totalMakeUpPrice);
        double leftMoney = totalMakeUpPrice - renovationMoney;
        if(0.0 <= leftMoney) {
            System.out.printf("Yes! %.2f lv left.%n", leftMoney);
        } else {
            System.out.printf("No! %.2f lv needed.%n", Math.abs(leftMoney));
        }

        // incorrect outputs
    }
}