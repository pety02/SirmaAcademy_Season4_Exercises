package entryAcademyPart.week1_lecture3.task25;

import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneLvCoinsCount;
        do {
            oneLvCoinsCount = Integer.parseInt(scanner.nextLine());
        } while (oneLvCoinsCount <= 0);

        int twoLvCoinsCount;
        do {
            twoLvCoinsCount = Integer.parseInt(scanner.nextLine());
        } while (twoLvCoinsCount <= 0);

        int fiveLvBanknotesCount;
        do {
            fiveLvBanknotesCount = Integer.parseInt(scanner.nextLine());
        } while (fiveLvBanknotesCount <= 0);

        int sum;
        do {
            sum = Integer.parseInt(scanner.nextLine());
        } while (sum < 1 || 1000 < sum);

        for (int count1lv = 0; count1lv <= oneLvCoinsCount; count1lv++) {
            for (int count2lv = 0; count2lv <= twoLvCoinsCount; count2lv++) {
                for (int count5lv = 0; count5lv <= fiveLvBanknotesCount; count5lv++) {
                    int currSum = count1lv + count2lv * 2 + count5lv * 5;
                    if (currSum == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", count1lv, count2lv, count5lv, sum);
                    }
                }
            }
        }
    }
}