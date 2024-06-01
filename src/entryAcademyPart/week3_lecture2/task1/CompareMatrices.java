package entryAcademyPart.week3_lecture2.task1;

import java.util.Scanner;

public class CompareMatrices {
    private static void fillMatrix(int R, int C, int[][] matrix, Scanner scanner) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = Integer.parseInt(scanner.next());
            }
        }
    }
    private static boolean areEqual(int R, int C, int[][] fstMatrix, int[][] sndMatrix) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(fstMatrix[i][j] != sndMatrix[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = Integer.parseInt(scanner.nextLine());
        int C = Integer.parseInt(scanner.nextLine());
        int[][] matrix1 = new int[R][C];
        int[][] matrix2 = new int[R][C];
        fillMatrix(R, C, matrix1, scanner);
        fillMatrix(R, C, matrix2, scanner);
        System.out.println(areEqual(R, C, matrix1, matrix2));
    }
}