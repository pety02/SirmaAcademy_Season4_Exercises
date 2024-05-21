package entryAcademyPart.week2_lecture1.task4;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    private static String[] swap(String left, String right) {
        left += right;
        right = left.substring(0, left.length() - right.length());
        left = left.substring(right.length());
        return new String[] {left, right};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[length];
        for (int i = 0; i < length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < length / 2; i++) {
            String[] swapped = swap(strings[i], strings[length - 1]);
            strings[i] = swapped[0];
            strings[length - 1] = swapped[1];
            length -= 1;
        }
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
}