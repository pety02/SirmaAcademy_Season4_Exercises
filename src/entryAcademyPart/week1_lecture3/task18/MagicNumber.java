package entryAcademyPart.week1_lecture3.task18;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intervalStart;
        do {
            intervalStart = Integer.parseInt(scanner.nextLine());
        } while (intervalStart < 1 || 999 < intervalStart);
        int intervalEnd;
        do {
            intervalEnd = Integer.parseInt(scanner.nextLine());
        } while (intervalEnd < intervalStart || 1000 < intervalEnd);
        int magicNumber;
        do {
            magicNumber = Integer.parseInt(scanner.nextLine());
        } while (magicNumber < 1 || 10000 < magicNumber);

        int combinationsCount = 0;
        for (int first = intervalStart; first <= intervalEnd; first++) {
            for (int second = intervalStart; second <= intervalEnd; second++) {
                combinationsCount++;
                if(first + second == magicNumber) {
                    System.out.printf("Combination %d - (%d + %d = %d)",
                            combinationsCount, first, second, magicNumber);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d",
                combinationsCount, magicNumber);
    }
}