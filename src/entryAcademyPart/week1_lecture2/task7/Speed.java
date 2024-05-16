package entryAcademyPart.week1_lecture2.task7;

import java.util.Scanner;

public class Speed {
    private static void speedInformation(int speed) {
        if(0 <= speed && speed <= 10) {
            System.out.println("slow");
        } else if(10 < speed && speed <= 60) {
            System.out.println("average");
        } else if (60 < speed && speed <= 120) {
            System.out.println("fast");
        } else if (120 < speed && speed <= 160) {
            System.out.println("super-fast");
        } else if(160 < speed) {
            System.out.println("turbo-fast");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = Integer.parseInt(scanner.nextLine());
        speedInformation(speed);
    }
}