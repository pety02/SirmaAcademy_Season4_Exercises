package entryAcademyPart.entry_exam;

import java.util.Scanner;

public class OrthancArchivesSearch {
    private static int findFirst(String[] records, String toBeFound) {
        for (int i = 0; i < records.length; i++) {
            if(records[i].equals(toBeFound)) {
                return i;
            }
        }

        return -1;
    }

    private static int findLast(String[] records, String toBeFound) {
        for (int i = records.length - 1; i >= 0; i--) {
            if(records[i].equals(toBeFound)) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String search = scanner.nextLine();
        String[] records = input.split(", ");
        int firstMatch = findFirst(records, search);
        if(0 <= firstMatch) {
            System.out.printf("First Occurrence: %d%n", firstMatch);
            int lastMatch = findLast(records, search);
            if(0 <= lastMatch) {
                System.out.printf("Last Occurrence: %d%n", lastMatch);
            } else {
                System.out.printf("Last Occurrence: %d%n", firstMatch);
            }
        } else {
            System.out.println("Record not found");
        }
    }
}