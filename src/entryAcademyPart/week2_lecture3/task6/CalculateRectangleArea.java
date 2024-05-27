package entryAcademyPart.week2_lecture3.task6;

import java.util.Scanner;

public class CalculateRectangleArea {
    private static double rectangleArea(double width, double height) throws Exception {
        if(width < 0.0) {
            throw new Exception("Width should be positive");
        }
        if(height < 0.0) {
            throw new Exception("Height should be positive");
        }
        return width * height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        try {
            System.out.printf("%.2f%n", rectangleArea(width, height));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}