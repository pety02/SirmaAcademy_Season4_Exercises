package entryAcademyPart.week1_lecture3.task12;

import java.util.Scanner;

public class PseudoFiboncciSequence {
    private static int fibonacci(int number) {
        if(number == 0) {
            return 0;
        }

        if(number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number -2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = Integer.parseInt(scanner.nextLine());
        } while(number < 0);
        int fibonacciSum = 0;
        for(int i = 1; i <= number; ++i) {
            fibonacciSum += fibonacci(i);
        }
        System.out.println(fibonacciSum);
    }
}