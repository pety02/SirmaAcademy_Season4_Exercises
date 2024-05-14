package entryAcademyPart.week1_lecture1.task20;

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double circleCircumference = 2 * Math.PI * radius;
        System.out.printf("%.2f", circleCircumference);
    }
}