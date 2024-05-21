package entryAcademyPart.week1_lecture3.task19;

import java.util.Scanner;

public class PadawanExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        do {
            money = Double.parseDouble(scanner.nextLine());
        } while (money < 0.00 || 1000.00 < money);

        int studentsCount;
        do {
            studentsCount = Integer.parseInt(scanner.nextLine());
        } while (studentsCount < 0 || 100 < studentsCount);

        double lightSabersPrice;
        do {
            lightSabersPrice = Double.parseDouble(scanner.nextLine());
        } while (lightSabersPrice < 0.00 || 100.00 < lightSabersPrice);

        double robesPrice;
        do {
            robesPrice = Double.parseDouble(scanner.nextLine());
        } while (robesPrice < 0.00 || 100.00 < robesPrice);

        double beltsPrice;
        do {
            beltsPrice = Double.parseDouble(scanner.nextLine());
        } while (beltsPrice < 0.00 || 100.00 < beltsPrice);

        int lightSabersCount = (int) Math.ceil (1.1 * studentsCount);
        int beltsCount = studentsCount;
        int freeBeltsCount = 0;
        while(beltsCount >= 0 && studentsCount >= 6) {
            freeBeltsCount++;
            beltsCount -= 6;
        }

        double neededMoney = lightSabersCount * lightSabersPrice + studentsCount * robesPrice + (studentsCount - freeBeltsCount) * beltsPrice;
        if( money - neededMoney >= 0) {
            System.out.printf("The money is enough - it would cost %.2f lv.", neededMoney);
        } else {
            System.out.printf("George Lucas will need %.2f lv more.", Math.abs(money - neededMoney));
        }
    }
}