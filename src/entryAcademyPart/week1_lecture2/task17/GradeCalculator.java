package entryAcademyPart.week1_lecture2.task17;

import java.util.Scanner;

public class GradeCalculator {
    private static char calculateGrade(int percentage) throws Exception {
        if(0 <= percentage && percentage <= 59) {
            return 'F';
        } else if (60 <= percentage && percentage <= 69) {
            return 'D';
        } else if (70 <= percentage && percentage <= 79) {
            return 'C';
        } else if (80 <= percentage && percentage <= 89) {
            return 'B';
        } else if (90 <= percentage && percentage <= 100) {
            return 'A';
        } else {
             throw new Exception("Grade percentage should be between 0 and 100!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradePercentage = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println(calculateGrade(gradePercentage));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}