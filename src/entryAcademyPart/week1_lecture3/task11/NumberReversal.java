package entryAcademyPart.week1_lecture3.task11;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        int revN = Integer.parseInt(reversed.toString());
        System.out.println(revN);
    }
}