package entryAcademyPart.week1_lecture3.task5;

import java.util.Scanner;

public class LettersInWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}