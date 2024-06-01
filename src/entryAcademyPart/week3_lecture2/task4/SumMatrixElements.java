package entryAcademyPart.week3_lecture2.task4;

import java.util.Scanner;

public class SumMatrixElements {
    private static void fillMatrix(int R, int C, int[][] matrix, Scanner scanner) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = Integer.parseInt(scanner.next());
            }
        }
    }
    private static int sumEelements(int R, int C, int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = Integer.parseInt(scanner.nextLine());
        int C = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[R][C];
        fillMatrix(R, C, matrix, scanner);
        System.out.println(sumEelements(R, C, matrix));
    }
}