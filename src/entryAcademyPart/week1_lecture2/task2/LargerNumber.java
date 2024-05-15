package entryAcademyPart.week1_lecture2.task2;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        if(secondNumber < firstNumber) {
            System.out.println(firstNumber);
        } else if(firstNumber < secondNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println("Equal");
        }
    }
}