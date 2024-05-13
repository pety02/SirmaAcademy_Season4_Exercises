package entryAcademyPart.week1_lecture1.task13;

import java.util.Scanner;

public class Office {
    // first = n
    // second = 0.8 * n
    // third = 1.15 * 1.8 * n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstCabinetPrice = scanner.nextDouble();
        double secondCabinetPrice = 0.8 * firstCabinetPrice;
        double thirdCabinetPrice = 1.15 * 1.8 * firstCabinetPrice;
        double totalPrice = firstCabinetPrice + secondCabinetPrice + thirdCabinetPrice;
        System.out.printf("%.3f", totalPrice);
    }
}