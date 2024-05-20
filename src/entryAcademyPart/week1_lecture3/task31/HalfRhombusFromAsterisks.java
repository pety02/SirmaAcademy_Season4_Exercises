package entryAcademyPart.week1_lecture3.task31;

import java.util.Scanner;

public class HalfRhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    int asterisksCount = i;
                    while(0 <= asterisksCount) {
                        System.out.print("* ");
                        asterisksCount--;
                    }
                }
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if(i == j) {
                    int asterisksCount = i;
                    while(0 <= asterisksCount) {
                        System.out.print("* ");
                        asterisksCount--;
                    }
                }
            }
            System.out.println();
        }
    }
}