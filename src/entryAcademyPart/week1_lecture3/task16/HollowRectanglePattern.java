package entryAcademyPart.week1_lecture3.task16;

import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0;
        do {
            n = Integer.parseInt(scanner.nextLine());
            m = Integer.parseInt(scanner.nextLine());
        } while(n < 0 || m < 0);

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if(row == 0 || row == n - 1) {
                    System.out.print('*');
                    continue;
                }
                if((col == 0 || col == m - 1)) {
                    System.out.print('*');
                    continue;
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}