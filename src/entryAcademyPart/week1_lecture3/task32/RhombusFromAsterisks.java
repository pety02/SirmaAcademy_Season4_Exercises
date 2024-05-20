package entryAcademyPart.week1_lecture3.task32;

import java.util.Scanner;

public class RhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int spaces = n / 2;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(" *");
            }
            System.out.println();
            if (i <= n / 2) {
                spaces--;
                stars++;
            } else {
                spaces++;
                stars--;
            }
        }
    }
}