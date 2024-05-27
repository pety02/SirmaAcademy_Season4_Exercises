package entryAcademyPart.week2_lecture2.task2;

import entryAcademyPart.week2_lecture2.task1.Car;

import java.util.Scanner;

public class CarModifiedTest {
    private static int parse(String seq) {
        return seq.isEmpty() ? 0 : Integer.parseInt(seq);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            size = Integer.parseInt(scanner.nextLine());
        } while (size <= 0);
        Car[] cars = new Car[size];
        for (int i = 0; i < size; i++) {
            cars[i] = new Car(scanner.nextLine(), scanner.nextLine(), parse(scanner.nextLine()));
        }
        for (Car currentCar : cars) {
            System.out.println("Info: " + currentCar.carInfo());
        }
    }
}