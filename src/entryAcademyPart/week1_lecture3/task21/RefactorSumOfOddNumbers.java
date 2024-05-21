package entryAcademyPart.week1_lecture3.task21;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        // The initial value of sum should be 0 because
        // of the summing process.
        int sum = 0;
        // The for loop should repeat from i = 0 to i < n
        // or from i = 1 to i <= n.
        for (int i = 0; i < n; i++) {
            // Here should be used println not only print.
            System.out.println(2 * i + 1);
            // Here should add 2 * i + 1 (the printed number).
            sum += (2 * i + 1);
        }
        // There was missing brace and incorrect System.out
        // method. The correct one is printf in order to print
        // the output formatted.
        System.out.printf("Sum: %d%n", sum);
    }
}