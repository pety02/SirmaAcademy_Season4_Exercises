package entryAcademyPart.week1_lecture3.task17;

import java.util.Scanner;

public class NewBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorsNumber = 0;
        do {
            floorsNumber = Integer.parseInt(scanner.nextLine());
        } while (floorsNumber <= 0);
        int roomsNumber = 0;
        do {
            roomsNumber = Integer.parseInt(scanner.nextLine());
        } while (roomsNumber <= 0);
        for (int floor = floorsNumber - 1; floor >= 0; floor--) {
            for (int room = 0; room < roomsNumber; room++) {
                if((floor + 1) == floorsNumber) {
                    System.out.printf("L%d%d ", floor + 1, room);
                    continue;
                }
                if((floor + 1) % 2 == 0) {
                    System.out.printf("O%d%d ", floor + 1, room);
                } else {
                    System.out.printf("A%d%d ", floor + 1, room);
                }
            }
            System.out.println();
        }
    }
}