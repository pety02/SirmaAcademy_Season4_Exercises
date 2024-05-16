package entryAcademyPart.week1_lecture2.task9;

import java.util.Scanner;

public class AddressByAge {
    private static String address(char gender, int years) {
        if(0 <= years && years < 16) {
            if(gender == 'f') {
                return "Miss";
            } else {
                return "Master";
            }
        } else {
            if(gender == 'f') {
                return "Ms";
            } else {
                return "Mr";
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char gender;
        do {
            gender = scanner.nextLine().charAt(0);
        } while(gender != 'f' && gender != 'm');

        int years;
        do {
            years = Integer.parseInt(scanner.nextLine());
        } while(years < 0);

        System.out.println(address(gender, years));
    }
}