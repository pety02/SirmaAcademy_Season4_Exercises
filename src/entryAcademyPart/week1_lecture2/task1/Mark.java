package entryAcademyPart.week1_lecture2.task1;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark = Double.parseDouble(scanner.nextLine());
        if(5.50 <= mark && mark <= 6.00) {
            System.out.println("Excellent!");
        } else {
            System.out.println("no output");
        }
    }
}