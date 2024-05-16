package entryAcademyPart.week1_lecture2.task19;

import java.util.Scanner;

public class MovieTicketPrice {
    private static int calculateTicketPrice(int years) {
        if(0 <= years && years <= 12) {
            return 5;
        } else if (13 <= years && years <= 19) {
            return 8;
        } else {
            return 10;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years;
        do {
            years = Integer.parseInt(scanner.nextLine());
        } while (years < 0);

        System.out.printf("$%d", calculateTicketPrice(years));
    }
}