package entryAcademyPart.week1_lecture2.task18;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        if((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println("It's a leap year!");
        } else {
            System.out.println("It's not a leap year!");
        }
    }
}