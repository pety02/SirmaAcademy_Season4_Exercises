package professionalAcademyPart.week3_lecture3.task7;

import professionalAcademyPart.week3_lecture3.task4.GenericBox;
import professionalAcademyPart.week3_lecture3.task6.GenericSwapMethodStrings;

import java.util.Scanner;

public class GenericSwapMethodIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        Integer[] inputs = new Integer[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = Integer.parseInt(scanner.nextLine());
        }
        GenericBox<Integer> box = new GenericBox<>(inputs);
        String command;
        String[] indexes;
        do {
            command = scanner.nextLine();
            indexes = command.split(" ");
        } while(indexes.length != 2);
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);
        GenericSwapMethodStrings.swap(firstIndex, secondIndex, box);
        System.out.println(box);
    }
}