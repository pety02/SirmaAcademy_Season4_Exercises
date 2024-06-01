package entryAcademyPart.week3_lecture2.task2;

import java.util.Scanner;

public class MatrixAddition {
    private static void fillMatrix(int R, int C, int[][] matrix, Scanner scanner) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = Integer.parseInt(scanner.next());
            }
        }
    }
    private static int[][] add(int R, int C, int[][] fstMatrix, int[][] sndMatrix) {
        int[][] sum = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sum[i][j] = fstMatrix[i][j] + sndMatrix[i][j];
            }
        }

        return sum;
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
        int[][] matrix1 = new int[R][C];
        int[][] matrix2 = new int[R][C];
        fillMatrix(R, C, matrix1, scanner);
        fillMatrix(R, C, matrix2, scanner);
        int[][] sumMatrix = add(R, C, matrix1, matrix2);
        print(R, C, sumMatrix);
    }
}
