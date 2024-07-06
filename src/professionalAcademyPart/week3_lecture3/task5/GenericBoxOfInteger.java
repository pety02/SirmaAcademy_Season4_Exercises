package professionalAcademyPart.week3_lecture3.task5;

import professionalAcademyPart.week3_lecture3.task4.GenericBox;

import java.util.Scanner;

public class GenericBoxOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        Integer[] inputs = new Integer[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = Integer.parseInt(scanner.nextLine());
        }
        GenericBox<Integer> box = new GenericBox<>(inputs);
        System.out.println(box);
    }
}