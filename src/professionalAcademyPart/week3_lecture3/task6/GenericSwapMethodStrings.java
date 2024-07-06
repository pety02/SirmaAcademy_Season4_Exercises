package professionalAcademyPart.week3_lecture3.task6;

import professionalAcademyPart.week3_lecture3.task4.GenericBox;

import java.util.Scanner;

public class GenericSwapMethodStrings {
    public static <T> void swap(int first, int second, GenericBox<T> box) {
        if(0 <= first && first <= second && second < box.getValue().length) {
            T[] values = box.getValue();
            T temp = values[second];
            values[second] = values[first];
            values[first] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] inputs = new String[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = scanner.nextLine();
        }
        GenericBox<String> box = new GenericBox<>(inputs);
        String command;
        String[] indexes;
        do {
            command = scanner.nextLine();
            indexes = command.split(" ");
        } while(indexes.length != 2);
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);
        swap(firstIndex, secondIndex, box);
        System.out.println(box);
    }
}