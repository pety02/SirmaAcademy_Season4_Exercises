package entryAcademyPart.week1_lecture3.task23;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NumbersUpTo1000EndingWithN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 0 || 9 < n);
        for (int i = 1; i <= 1000; i++) {
            if((i + "").endsWith(n + "")) {
                System.out.println(i);
            }
        }
    }
}