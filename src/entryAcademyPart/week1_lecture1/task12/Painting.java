package entryAcademyPart.week1_lecture1.task12;

import java.util.Scanner;

public class Painting {
    // red = x kg
    // yellow = 4x kg
    // white = 8x kg
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double redPerRoom = n * (1.0 / 13.0);
        double yellowPerRoom = n * (4.0 / 13.0);
        double whitePerRoom = n * (8.0 / 13.0);

        System.out.printf("Red: %.4f%n", redPerRoom);
        System.out.printf("Yellow: %.4f%n", yellowPerRoom);
        System.out.printf("White: %.4f%n", whitePerRoom);
    }
}