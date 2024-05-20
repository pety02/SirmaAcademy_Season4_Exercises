package entryAcademyPart.week2_lecture1.task1;

import java.util.Scanner;

public class SumFirstAndLastArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] inputs = new String[size];
        for (int i = 0; i < size; i++) {
            inputs[i] = scanner.nextLine();
        }
        int sum = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[inputs.length - 1]);
        System.out.println(sum);
    }
}