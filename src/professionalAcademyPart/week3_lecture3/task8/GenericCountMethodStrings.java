package professionalAcademyPart.week3_lecture3.task8;

import java.util.*;

public class GenericCountMethodStrings {
    public static <T extends Comparable<T>> int count(List<T> lst, T element) {
        int count = 0;
        for(T el : lst) {
            if(el.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] inputs = new String[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = scanner.nextLine();
        }
        String toBeComparedTo = scanner.nextLine();
        System.out.println(count(Arrays.stream(inputs).toList(), toBeComparedTo));
    }
}