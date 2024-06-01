package entryAcademyPart.week3_lecture2.task10;

import java.util.Scanner;

public class ZeroMatrix {
    private static void fillMatrix(int R, int C, int[][] matrix, Scanner scanner) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = Integer.parseInt(scanner.next());
            }
        }
    }

    private static void makeZeroRow(int R, int C, int i, int[][] matrix) {
        for (int j = 0; j < R; j++) {
            if(j == i) {
                for (int k = 0; k < C; k++) {
                    matrix[j][k] = 0;
                }
            }
        }
    }

    private static void makeZeroCol(int R, int C, int j, int[][] matrix) {
        for (int i = 0; i < C; i++) {
            if(i == j) {
                for (int k = 0; k < R; k++) {
                    matrix[k][i] = 0;
                }
            }
        }
    }

    private static void makeZeroMatrix(int R, int C, int[][] matrix) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(matrix[i][j] == 0) {
                    makeZeroRow(R, C, i, matrix);
                    makeZeroCol(R, C, j, matrix);
                    return;
                }
            }
        }
    }

    private static void print(int R, int C, int[][] matrix) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = Integer.parseInt(scanner.nextLine());
        int C = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[R][C];
        fillMatrix(R, C, matrix, scanner);
        makeZeroMatrix(R, C, matrix);
        print(R, C, matrix);
    }
}