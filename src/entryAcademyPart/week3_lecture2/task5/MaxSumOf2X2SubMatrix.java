package entryAcademyPart.week3_lecture2.task5;

import java.util.Scanner;

public class MaxSumOf2X2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] elements = scanner.nextLine().split(",");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int[][] maxSubmatrix = new int[2][2];

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSubmatrix[0][0] = matrix[i][j];
                    maxSubmatrix[0][1] = matrix[i][j + 1];
                    maxSubmatrix[1][0] = matrix[i + 1][j];
                    maxSubmatrix[1][1] = matrix[i + 1][j + 1];
                }
            }
        }

        System.out.println(maxSum);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(maxSubmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}