package entryAcademyPart.week2_lecture3.task2;

import java.util.Scanner;

public class Grades {
    private static String grade(double mark) {
        if(2.00 <= mark && mark <= 2.99) {
            return "Fail";
        } else if(3.00 <= mark && mark <= 3.49) {
            return "Poor";
        } else if(3.50 <= mark && mark <= 4.49) {
            return "Good";
        } else if (4.50 <= mark && mark <= 5.49) {
            return "Very good";
        } else if (5.50 <= mark && mark <= 6.00) {
            return "Excellent";
        } else {
            return "Out of range";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark = Double.parseDouble(scanner.nextLine());
        System.out.println(grade(mark));
    }
}