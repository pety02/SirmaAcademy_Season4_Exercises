package entryAcademyPart.week1_lecture2.task3;

import java.util.Scanner;

public class NumberFrom0To9WithWords {
    public static void main(String[] args) {
        String[] numbersWithWords = new String[] {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if(number < 0) {
            System.out.println("too small");
            return;
        }
        for(int i = 0; i < numbersWithWords.length; ++i) {
             if (number == i) {
                System.out.println(numbersWithWords[i]);
                return;
            }
        }
        System.out.println("too big");
    }
}