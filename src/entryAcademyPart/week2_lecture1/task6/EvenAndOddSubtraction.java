package entryAcademyPart.week2_lecture1.task6;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] numbers = new String[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextLine();
        }
        int result = 0;
        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if(num % 2 == 0) {
                result += num;
            } else {
                result -= num;
            }
        }
        System.out.println(result);
    }
}