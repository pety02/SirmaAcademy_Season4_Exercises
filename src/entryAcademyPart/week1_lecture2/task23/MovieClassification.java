package entryAcademyPart.week1_lecture2.task23;

import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        do {
            age = Integer.parseInt(scanner.nextLine());
        } while (age < 0);

        if(age < 13) {
            System.out.println("U-rated movies");
        } else if (age < 18) {
            System.out.println("U and PG-13 rated movies");
        } else {
            System.out.println("All movies");
        }
    }
}