package entryAcademyPart.week2_lecture1.task9;

import java.util.Scanner;

public class PrintEveryNthElementFromAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextLine();
        }

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i+=n) {
            System.out.printf("%s ", arr[i]);
        }
    }
}