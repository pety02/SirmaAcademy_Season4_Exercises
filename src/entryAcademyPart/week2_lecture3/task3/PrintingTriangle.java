package entryAcademyPart.week2_lecture3.task3;

import java.util.Scanner;

public class PrintingTriangle {
    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int steps = i;
            for (int j = 1; j <= n; j++) {
                int number = 1;
                while(steps > 0) {
                    System.out.print(number++ + " ");
                    steps--;
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            int steps = i;
            for (int j = n - 1; j > 0; j--) {
                int number = 1;
                while(steps > 0) {
                    System.out.print(number++ + " ");
                    steps--;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0);
        printTriangle(n);
    }
}