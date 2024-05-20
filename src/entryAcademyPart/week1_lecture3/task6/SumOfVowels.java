package entryAcademyPart.week1_lecture3.task6;

import java.util.Scanner;

public class SumOfVowels {
    private static char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(word.charAt(i) == vowels[j]) {
                    sum += (j + 1);
                }
            }
        }

        System.out.println(sum);
    }
}