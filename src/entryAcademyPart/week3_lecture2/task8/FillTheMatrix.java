package entryAcademyPart.week3_lecture2.task8;

import java.util.Scanner;

public class FillTheMatrix {
    private static void fillMatrixPatternA(int R, int C, int[][] matrix) {
        int start = 1;
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < R; i++) {
                matrix[i][j] = start++;
            }
        }
    }

    private static void fillMatrixPatternB(int R, int C, int[][] matrix) {
        int start = 1;
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < R; i++) {
                if(j % 2 == 0) {
                    matrix[i][j] = start++;
                } else {
                    matrix[i][j] = start--;
                }
            }
            if(j % 2 == 0) {
                start += 3;
            } else {
                start += 5;
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
        System.out.println();
        fillMatrixPatternA(R, C, matrix);
        print(R, C, matrix);
        System.out.println();
        fillMatrixPatternB(R, C, matrix);
        print(R, C, matrix);
    }
}
