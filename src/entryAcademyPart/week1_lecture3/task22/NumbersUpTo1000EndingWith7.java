package entryAcademyPart.week1_lecture3.task22;

import java.util.stream.IntStream;

public class NumbersUpTo1000EndingWith7 {
    public static void main(String[] args) {
        IntStream.
                rangeClosed(1, 1000).
                mapToObj(i -> i + "").
                filter(number -> number.endsWith("7")).
                forEach(System.out::println);
    }
}