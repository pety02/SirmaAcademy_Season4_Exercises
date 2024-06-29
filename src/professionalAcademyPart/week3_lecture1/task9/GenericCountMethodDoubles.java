package professionalAcademyPart.week3_lecture1.task9;

import professionalAcademyPart.week3_lecture1.task8.GenericCountMethodStrings;

import java.util.Arrays;
import java.util.Scanner;

public class GenericCountMethodDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        Double[] inputs = new Double[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = Double.parseDouble(scanner.nextLine());
        }
        Double toBeComparedTo = Double.parseDouble(scanner.nextLine());
        System.out.println(GenericCountMethodStrings.count(Arrays.stream(inputs).toList(), toBeComparedTo));
    }
}