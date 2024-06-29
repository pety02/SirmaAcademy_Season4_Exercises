package professionalAcademyPart.week1_lecture1.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordLengths {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\OneDrive\\Documents\\SirmaAcademy\\week1_exercises_part1\\src\\professionalAcademyPart\\week1_lecture1\\task1\\words.txt";
        try (BufferedReader inputStream = new BufferedReader(new FileReader(path))) {
            int currentByte;
            StringBuilder currentWord = new StringBuilder();
            ArrayList<Integer> lengths = new ArrayList<>();
            do {
                currentByte = inputStream.read();
                char currentSymbol = (char) currentByte;
                currentWord.append(currentSymbol);
            } while(currentByte > -1);
            String[] currentLineWords = currentWord.toString().split(" ");
            for (String currWord : currentLineWords) {
                lengths.add(currWord.length());
            }
            for (int i = 0; i < lengths.size(); i++) {
                int size = lengths.get(i);
                if(i == lengths.size() - 1) {
                    size--;
                    System.out.printf("%d", size);
                    break;
                }
                System.out.printf("%d, ", size);
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}