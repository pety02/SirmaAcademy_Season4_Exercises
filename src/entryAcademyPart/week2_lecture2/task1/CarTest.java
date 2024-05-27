package entryAcademyPart.week2_lecture2.task1;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            size = Integer.parseInt(scanner.nextLine());
        } while (size <= 0);
        Car[] cars = new Car[size];
        for (int i = 0; i < size; i++) {
            cars[i] = new Car(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        }
        for (Car currentCar : cars) {
            System.out.println("Info: " + currentCar.carInfo());
        }
    }
}