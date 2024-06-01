package entryAcademyPart.week3_lecture2.task3;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    private static void fillMatrix(int R, int C, char[][] matrix, Scanner scanner) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = scanner.next().charAt(0);
            }
        }
    }
    private static void print(int R, int C, char[][] matrix) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.printf("%c ", matrix[i][j]);
            }
            System.out.println();
        }
    }
    private static char[][] intersect(int R, int C, char[][] fstMatrix, char[][] sndMatrix) {
        char[][] intersection = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(fstMatrix[i][j] == sndMatrix[i][j]) {
                    intersection[i][j] = fstMatrix[i][j];
                } else {
                    intersection[i][j] = '*';
                }
            }
        }

        return intersection;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = Integer.parseInt(scanner.nextLine());
        int C = Integer.parseInt(scanner.nextLine());
        char[][] matrix1 = new char[R][C];
        char[][] matrix2 = new char[R][C];
        fillMatrix(R, C, matrix1, scanner);
        fillMatrix(R, C, matrix2, scanner);
        char[][] intersection = intersect(R, C, matrix1, matrix2);
        print(R, C, intersection);
    }
}