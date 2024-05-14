package entryAcademyPart.week1_lecture1.task14;

import java.util.Scanner;
public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int distanceThreeHoursLater = 5 * x - 3 * y;
        System.out.println(distanceThreeHoursLater);
    }
}