package entryAcademyPart.week1_lecture3.task24;

import java.util.Scanner;

public class Encoding {
    private static int countDigits(int number) {
        return (number + "").length();
    }
    private static String getNumberReversed(int number) {
        StringBuilder sb = new StringBuilder(number + "");
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int linesCount = countDigits(number);
        String reversedNumber = getNumberReversed(number);
        for (int i = 0; i < linesCount; i++) {
            if(reversedNumber.charAt(i) == '0') {
                System.out.println("ZERO");
                continue;
            }
            int repeatTimes = reversedNumber.charAt(i) - '0';
            while(repeatTimes > 0) {
                System.out.print((char)(reversedNumber.charAt(i) - '0' + 33));
                repeatTimes--;
            }
            System.out.println();
        }
    }
}