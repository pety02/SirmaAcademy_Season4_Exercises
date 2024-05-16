package entryAcademyPart.week1_lecture1.task7;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        int degrees = Integer.parseInt(scanner.nextLine());

        System.out.printf("Today in %s it is %d degrees.", town, degrees);
    }
}