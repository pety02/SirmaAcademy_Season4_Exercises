package entryAcademyPart.week3_lecture2.task7;

import java.util.Scanner;

public class MatrixDiagonalsSum {
    private static void fillMatrix(int N, int[][] matrix, Scanner scanner) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(scanner.next());
            }
        }
    }

    private static int[] mainDiagonal(int N, int[][] matrix) {
        int[] diagonal = new int[N];
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j) {
                    diagonal[index++] = matrix[i][j];
                }
            }
        }

        return diagonal;
    }

    private static int[] secondaryDiagonal(int N, int[][] matrix) {
        int[] diagonal = new int[N];
        int index = 0;
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                if(j == N - 1 - i) {
                    diagonal[index++] = matrix[i][j];
                }
            }
        }

        return diagonal;
    }

    private static int diagonalsSum(int N, int[] main, int[] secondary) {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += main[i];
        }

        for (int i = 0; i < N; i++) {
            sum += secondary[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[N][N];
        fillMatrix(N, matrix, scanner);
        int[] main = mainDiagonal(N, matrix);
        int[] secondary = secondaryDiagonal(N, matrix);
        System.out.println(diagonalsSum(N, main, secondary));
    }
}