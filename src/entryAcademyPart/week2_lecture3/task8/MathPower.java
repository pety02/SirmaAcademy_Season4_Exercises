package entryAcademyPart.week2_lecture3.task8;

import java.util.Scanner;

public class MathPower {
    private static double pow(double number, int power) {
        double powered = 1;
        while(power > 0) {
            powered *= number;
            power--;
        }

        return powered;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.3f%n", pow(number, power));
    }
}