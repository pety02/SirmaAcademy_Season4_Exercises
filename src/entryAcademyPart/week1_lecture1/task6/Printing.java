package entryAcademyPart.week1_lecture1.task6;

import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char symbol = scanner.nextLine().charAt(0);
        int number = Integer.parseInt(scanner.nextLine());
        double realNumber = Double.parseDouble(scanner.nextLine());

        System.out.println(text);
        System.out.println(symbol);
        System.out.println(number);
        System.out.println(realNumber);
    }
}