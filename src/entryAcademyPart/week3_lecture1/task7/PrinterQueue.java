package entryAcademyPart.week3_lecture1.task7;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("print")) {
                break;
            } else if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Standby");
                } else {
                    System.out.println("Canceled " + queue.pollFirst());
                }
            } else {
                queue.offer(input);
            }
        }

        if (queue.isEmpty()) {
            System.out.println("Standby");
        } else {
            while (!queue.isEmpty()) {
                System.out.println(queue.pollFirst());
            }
        }
    }
}