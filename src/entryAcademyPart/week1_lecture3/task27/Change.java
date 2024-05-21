package entryAcademyPart.week1_lecture3.task27;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change;
        do {
            change = Double.parseDouble(scanner.nextLine());
        } while (change < 0.00);
        int changeInCoins = (int) Math.round(change * 100);
        int coinsCount = 0;
        while(true) {
            if(0 == changeInCoins) {
                break;
            }
            if(0 <= changeInCoins - 200) {
                coinsCount++;
                changeInCoins -= 200;
            }
            if(0 <= changeInCoins - 100) {
                coinsCount++;
                changeInCoins -= 100;
            }
            if(0 <= changeInCoins - 50) {
                coinsCount++;
                changeInCoins -= 50;
            }
            if(0 <= changeInCoins - 20) {
                coinsCount++;
                changeInCoins -= 20;
            }
            if(0 <= changeInCoins - 10) {
                coinsCount++;
                changeInCoins -= 10;
            }
            if(0 <= changeInCoins - 5) {
                coinsCount++;
                changeInCoins -= 5;
            }
            if(0 <= changeInCoins - 2) {
                coinsCount++;
                changeInCoins -= 2;
            }
            if(0 <= changeInCoins - 1) {
                coinsCount++;
                changeInCoins -= 1;
            }
            System.out.println(coinsCount);
        }
    }
}