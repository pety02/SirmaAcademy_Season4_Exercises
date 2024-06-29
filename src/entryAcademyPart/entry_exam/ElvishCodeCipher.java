package entryAcademyPart.entry_exam;

import java.util.Scanner;

public class ElvishCodeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append((char)(input.charAt(i) - n));
        }
        System.out.println(output);
    }
}