package entryAcademyPart.week1_lecture1.task8;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371192;
        System.out.println(miles);
    }
}