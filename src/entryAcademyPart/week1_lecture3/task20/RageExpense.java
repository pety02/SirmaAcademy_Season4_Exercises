package entryAcademyPart.week1_lecture3.task20;

import java.util.Scanner;

public class RageExpense {
    private static int countTrashedHeadSets(int lostGames) {
        int count = 0;
        while(lostGames > 0) {
            lostGames -= 2;
            count++;
        }

        return count - 1;
    }

    private static int countTrashedMouses(int lostGames) {
        int count = 0;
        while(lostGames > 0) {
            count++;
            lostGames -= 3;
        }

        return count - 1;
    }

    private static int countTrashedKeyboards(int lostGames) {
        int count = 0;
        while(lostGames > 0) {
            count++;
            lostGames -= 6;
        }

        return count - 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames;
        do {
            lostGames = Integer.parseInt(scanner.nextLine());
        } while (lostGames < 0 || 1000 < lostGames);

        double headSetPrice;
        do {
            headSetPrice = Double.parseDouble(scanner.nextLine());
        } while (headSetPrice < 0.00 || 1000.00 < headSetPrice);

        double mousePrice;
        do {
            mousePrice = Double.parseDouble(scanner.nextLine());
        } while (mousePrice < 0.00 || 1000.00 < mousePrice);

        double keyboardPrice;
        do {
            keyboardPrice = Double.parseDouble(scanner.nextLine());
        } while (keyboardPrice < 0.00 || 1000.00 < keyboardPrice);

        double displayPrice;
        do {
            displayPrice = Double.parseDouble(scanner.nextLine());
        } while (displayPrice < 0.00 || 1000.00 < displayPrice);

        int trashedHeadSets = countTrashedHeadSets(lostGames);
        int trashedMouses = countTrashedMouses(lostGames);
        int trashedKeyboards = countTrashedKeyboards(lostGames);
        int trashedDisplays = (trashedKeyboards / 2);
        double expenses = trashedHeadSets * headSetPrice + trashedMouses * mousePrice + trashedKeyboards * keyboardPrice + trashedDisplays * displayPrice;
        System.out.printf("Rage expenses: %.2f lv", expenses);
    }
}