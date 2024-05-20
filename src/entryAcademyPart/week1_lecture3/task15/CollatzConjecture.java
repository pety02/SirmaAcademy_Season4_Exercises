package entryAcademyPart.week1_lecture3.task15;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollatzConjecture {
    private static ArrayList<Integer> makeCollatz(int number, ArrayList<Integer> numbers, int i) {
        if(i < 1) {
            numbers.add(number);
        }
        if(number == 1) {
            return numbers;
        }
        if(number % 2 == 0) {
            number /= 2;
            numbers.add(number);
            return makeCollatz(number, numbers, ++i);
        }
        number  = number * 3 + 1;
        numbers.add(number);
        return makeCollatz(number, numbers, ++i);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> lst = new ArrayList<>();
        int index = 0;
        System.out.println(Arrays.toString(makeCollatz(startNumber, lst, index).toArray()));
    }
}