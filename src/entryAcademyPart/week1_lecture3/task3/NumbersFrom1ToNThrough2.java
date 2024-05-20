package entryAcademyPart.week1_lecture3.task3;

import java.util.Scanner;

public class NumbersFrom1ToNThrough2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < n; i+=2) {
            System.out.println(i);
        }
    }
}