package entryAcademyPart.week1_lecture2.task22;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ages;
        do {
            ages = Integer.parseInt(scanner.nextLine());
        } while(ages < 0);

        String hasMembershipCard;
        do {
            hasMembershipCard = scanner.nextLine();
        } while (!hasMembershipCard.equals("No") && !hasMembershipCard.equals("Yes"));

        if(ages < 18) {
            System.out.println("10% discount");
        } else if (ages <= 64) {
            if(hasMembershipCard.equals("Yes")) {
                System.out.println("20% discount");
            } else {
                System.out.println("10% discount");
            }
        } else {
            System.out.println("30% discount");
        }
    }
}