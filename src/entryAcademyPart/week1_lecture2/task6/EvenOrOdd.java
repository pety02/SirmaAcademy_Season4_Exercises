package entryAcademyPart.week1_lecture2.task6;

import java.util.Scanner;

public class EvenOrOdd {
    private static String isEven(int number) {
        return (number % 2 == 0) ? "even" : "odd";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(isEven(number));
    }
}