package entryAcademyPart.week3_lecture2.task9;

import java.util.Scanner;

public class RowsSumAndColsSum {
    private static void fillMatrix(int R, int C, int[][] matrix, Scanner scanner) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
    }

    private static int[] sumRows(int R, int C, int[][] matrix) {
        int[] rowsSum = new int[R];
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                rowsSum[index] += matrix[i][j];
            }
            index++;
        }

        return rowsSum;
    }

    private static int[] sumCols(int R, int C, int[][] matrix) {
        int[] colsSum = new int[R];
        int index = 0;
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < R; i++) {
                colsSum[index] += matrix[i][j];
            }
            index++;
        }

        return colsSum;
    }

    private static void printSum(int[] sums, int N) {
        for (int i = 0; i < N; i++) {
            if(i == N - 1) {
                System.out.print(sums[i]);
                break;
            }
            System.out.print(sums[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = Integer.parseInt(scanner.nextLine());
        int C = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[R][C];
        fillMatrix(R, C, matrix, scanner);
        int[] rowsSum = sumRows(R, C, matrix);
        int[] colsSum = sumCols(R, C, matrix);
        printSum(rowsSum, R);
        System.out.println();
        printSum(colsSum, C);
    }
}