package entryAcademyPart.week2_lecture3.task7;

import java.util.Scanner;

public class RepeatString {
    private static String repeat(String word, int count) {
        StringBuilder sb = new StringBuilder();
        while (count > 0) {
            sb.append(word);
            count--;
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println(repeat(word, count));
    }
}