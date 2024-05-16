package entryAcademyPart.week1_lecture2.task28;

import java.util.Scanner;

public class ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double latitudeValue = Double.parseDouble(scanner.nextLine());
        char hemisphere = scanner.nextLine().charAt(0);
        if(Math.abs(latitudeValue) == 0.0 && (hemisphere == 'N' || hemisphere == 'S')) {
            System.out.println("Equator");
        } else if (0 < Math.abs(latitudeValue) && Math.abs(latitudeValue) <= 23.5
                && (hemisphere == 'N' || hemisphere == 'S')) {
            System.out.println("Tropic zone");
        } else if (23.5 < Math.abs(latitudeValue) && Math.abs(latitudeValue) <= 66.5
                && (hemisphere == 'N' || hemisphere == 'S')) {
            System.out.println("Temperate zone");
        } else if (66.5 < Math.abs(latitudeValue) && (hemisphere == 'N' || hemisphere == 'S')){
            System.out.println("Arctic zone");
        } else {
            System.out.println("Uncertain");
        }
    }
}