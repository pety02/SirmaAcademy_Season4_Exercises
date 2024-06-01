package entryAcademyPart.week3_lecture1.task2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        int index = 0;
        String firstLine = scanner.nextLine();
        String[] firstLineNumbers = firstLine.split("\\s+");
        for (String number : firstLineNumbers) {
            numbers[index++] = Integer.parseInt(number);
        }

        String secondLine = scanner.nextLine();
        String[] secondLineNumbers = secondLine.split("\\s+");
        Stack<Integer> numbersData = new Stack<>();
        for (int i = 0; i < numbers[0] && i < secondLineNumbers.length; ++i) {
            numbersData.push(Integer.parseInt(secondLineNumbers[i]));
        }
        for (int i = 0; i < numbers[1] && !numbersData.empty(); i++) {
            numbersData.pop();
        }
        if(numbersData.empty()) {
            System.out.println(0);
            return;
        }
        Integer minElement = Integer.MAX_VALUE;
        for (Integer number : numbersData) {
            if(number < minElement) {
                minElement = number;
            }
        }
        if (numbersData.contains(numbers[2])) {
            System.out.println("true");
        } else {
            System.out.println(minElement);
        }
    }
}