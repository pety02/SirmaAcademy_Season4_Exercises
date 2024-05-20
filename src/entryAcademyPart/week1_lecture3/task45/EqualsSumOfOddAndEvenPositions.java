package entryAcademyPart.week1_lecture3.task45;

import java.util.Scanner;

public class EqualsSumOfOddAndEvenPositions {
    private static boolean areEvensAndOddsSumsEqual(int number) {
        String sequence = number + "";
        int sum = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if(i % 2 == 0) {
                sum += (sequence.charAt(i) - '0');
            } else {
                sum -= (sequence.charAt(i) - '0');
            }
        }

        return sum == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fstNum;
        do {
            fstNum = Integer.parseInt(scanner.nextLine());
        } while (fstNum < 100000 || 300000 < fstNum);
        int sndNum;
        do {
            sndNum = Integer.parseInt(scanner.nextLine());
        } while (sndNum < fstNum || 300000 < sndNum);

        int numbersCount = 0;
        for (int number = fstNum; number <= sndNum; number++) {
            if(areEvensAndOddsSumsEqual(number)) {
                System.out.println(number);
                numbersCount++;
            }
        }
        if(numbersCount == 0) {
            System.out.println("None");
        }

        System.out.println();
    }
}