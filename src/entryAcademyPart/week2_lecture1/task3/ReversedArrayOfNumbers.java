package entryAcademyPart.week2_lecture1.task3;

import java.util.Scanner;

public class ReversedArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(nums[i]);
        }
    }
}