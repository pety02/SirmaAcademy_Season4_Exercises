package entryAcademyPart.week1_lecture1.task15;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%.2f", bmi);

        // The first output is incorrect.
    }
}