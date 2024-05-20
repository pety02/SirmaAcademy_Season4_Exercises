package entryAcademyPart.week1_lecture3.task4;

import java.util.Scanner;

public class NumbersFrom1ToNThroughM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m;
        do {
            m = Integer.parseInt(scanner.nextLine());
        } while (n < m);
        for (int i = 0; i < n; i+=m) {
            System.out.println(i);
        }
    }
}