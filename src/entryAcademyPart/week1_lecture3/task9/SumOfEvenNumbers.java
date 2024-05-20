package entryAcademyPart.week1_lecture3.task9;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOfEvens = 0;
        for(int i = 1; n != 0; ++i) {
            if(i % 2 == 0) {
                sumOfEvens += i;
                n--;
            }
        }
        System.out.println(sumOfEvens);
    }
}