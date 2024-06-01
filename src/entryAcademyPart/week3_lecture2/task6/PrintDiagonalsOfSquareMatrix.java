package entryAcademyPart.week3_lecture2.task6;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
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

    private static void printDiagonal(int N, int[] diagonal) {
        for (int i = 0; i < N; i++) {
            System.out.print(diagonal[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[N][N];
        fillMatrix(N, matrix, scanner);
        printDiagonal(N, mainDiagonal(N, matrix));
        printDiagonal(N, secondaryDiagonal(N, matrix));
    }
}