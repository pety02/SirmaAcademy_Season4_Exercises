package entryAcademyPart.week2_lecture1.task5;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] numbers = new String[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextLine();
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}