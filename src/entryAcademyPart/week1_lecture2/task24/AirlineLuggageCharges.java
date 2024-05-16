package entryAcademyPart.week1_lecture2.task24;

import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight;
        do {
            weight = Integer.parseInt(scanner.nextLine());
        } while (weight < 0);

        int dimensions;
        do {
            dimensions = Integer.parseInt(scanner.nextLine());
        } while (dimensions < 0);

        int permittedDimensionsSum = 158;
        int charge = 0;
        if(50 < weight) {
            charge += 100;
        }
        if(permittedDimensionsSum + 1 <= dimensions && dimensions <= permittedDimensionsSum + 20) {
            charge += 50;
        } else if(permittedDimensionsSum + 21 <= dimensions && dimensions <= permittedDimensionsSum + 50) {
            charge += 100;
        } else {
            charge += 200;
        }

        System.out.println(charge);
        // The last given output is incorrect.
    }
}