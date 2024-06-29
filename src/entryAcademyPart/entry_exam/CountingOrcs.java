package entryAcademyPart.entry_exam;

import java.util.Scanner;

public class CountingOrcs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orcsCount = Integer.parseInt(scanner.nextLine());
        int increasingCount = Integer.parseInt(scanner.nextLine());
        int hoursNumber = Integer.parseInt(scanner.nextLine());

        int totalOrcs = orcsCount;
        for (int leftHours = hoursNumber - 1; 0 < leftHours; --leftHours, totalOrcs += orcsCount) {
            orcsCount += increasingCount;
        }

        System.out.println(totalOrcs);
    }
}