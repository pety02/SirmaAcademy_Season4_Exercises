package entryAcademyPart.week1_lecture1.task9;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double average = sum / 2.0;

        System.out.printf("The sum is: %d%n", sum);
        System.out.printf("The difference is: %d%n", difference);
        System.out.printf("The product is: %d%n", product);
        System.out.printf("The average is: %f%n", average);

        /*
        * For this input:
        * 3
        * 46
        *
        * The expected result output:
        * The sum is: 49
        * The difference is: 43
        * The product is: 138
        * The sum is: 24
        * is incorrect. The correct values are: 49, -43, 138, 24.500000.
        * Also, on the last line should be Yhe average is: 24.500000 :)
        *
        */
    }
}