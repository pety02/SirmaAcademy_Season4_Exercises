package entryAcademyPart.week3_lecture1.task1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            deque.push(Integer.parseInt(scanner.next()));
        }
        while (!deque.isEmpty()) {
            System.out.printf("%d ", deque.pop());
        }
    }
}