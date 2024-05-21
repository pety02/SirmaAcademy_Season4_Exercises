package entryAcademyPart.week1_lecture3.task28;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int rowsCount = (number % 3 == 0) ? number / 3 : (number / 3) + 1;
        int colsCount = rowsCount;
        int printNumber = 1;
        for (int row = 0; row < rowsCount; row++) {
            for (int col = 0; col < colsCount; col++) {
                if(row == col) {
                    int numbersCount = row;
                    while(0 <= numbersCount && printNumber <= number) {
                        System.out.print(printNumber + " ");
                        printNumber++;
                        numbersCount--;
                    }
                }
            }
            System.out.println();
        }
    }
}