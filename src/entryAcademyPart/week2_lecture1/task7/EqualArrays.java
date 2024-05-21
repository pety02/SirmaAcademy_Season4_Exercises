package entryAcademyPart.week2_lecture1.task7;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    private static int sumElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
    private static int equals(int[] arr1, int[] arr2) {
        if(arr2.length < arr1.length) {
            return arr1.length - 1;
        }
        if (arr1.length < arr2.length) {
            return arr2.length - 1;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fstArrLen = Integer.parseInt(scanner.nextLine());
        int[] fstArr = new int[fstArrLen];
        for (int i = 0; i < fstArrLen; i++) {
            fstArr[i] = Integer.parseInt(scanner.nextLine());
        }
        int sndArrLen = Integer.parseInt(scanner.nextLine());
        int[] sndArr = new int[sndArrLen];
        for (int i = 0; i < sndArrLen; i++) {
            sndArr[i] = Integer.parseInt(scanner.nextLine());
        }
        if(Arrays.equals(fstArr, sndArr)) {
            int sum = sumElements(fstArr);
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index", equals(fstArr, sndArr));
        }
    }
}