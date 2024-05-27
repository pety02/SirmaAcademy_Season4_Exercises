package entryAcademyPart.week2_lecture3.task1;

import java.util.Scanner;

public class SignOfInteger {
    private static String sign(int number) {
        if(0 < number) {
            return "positive";
        } else if(number == 0){
            return "zero";
        } else {
            return "negative";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.printf("The number %d is %s.", number, sign(number));
    }
}