package entryAcademyPart.week2_lecture1.task10;

import java.util.Arrays;

public class AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        CustomArray ca = new CustomArray(10);
        ca.add();
        ca.add();
        ca.remove();
        ca.add();
        ca.add();
        ca.remove();
        ca.remove();
        ca.remove();
        System.out.println(ca);
    }
}