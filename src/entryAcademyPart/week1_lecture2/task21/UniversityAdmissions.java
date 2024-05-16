package entryAcademyPart.week1_lecture2.task21;

import java.util.Scanner;

public class UniversityAdmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        int extracurriculars = Integer.parseInt(scanner.nextLine());
        if(80 <= score && score <= 89 && 2 <= extracurriculars) {
            System.out.println("Admitted");
        } else if(90 <= score) {
            System.out.println("Admitted");
        } else {
            System.out.println("Not admitted");
        }
    }
}