package professionalAcademyPart.week3_lecture3.task2;

import java.util.Arrays;

public class GenericArrayCreatorClass {
    public static void main(String[] args) {
        String[] words = GenericArrayCreator.create(5, "Hello");
        Integer[] numbers = GenericArrayCreator.create(Integer.class, 10, 5);

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(numbers));
    }
}