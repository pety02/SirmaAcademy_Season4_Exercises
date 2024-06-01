package entryAcademyPart.week3_lecture1.task5;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        if (decimal == 0) {
            System.out.println("Binary representation: 0");
        } else {
            Stack<Integer> stack = new Stack<>();

            while (decimal != 0) {
                stack.push(decimal % 2);
                decimal /= 2;
            }

            System.out.print("Binary representation: ");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}