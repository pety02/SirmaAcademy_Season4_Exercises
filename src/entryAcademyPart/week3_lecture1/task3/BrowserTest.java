package entryAcademyPart.week3_lecture1.task3;

import java.util.Scanner;

public class BrowserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Browser myBrowser = new Browser();
        String currentCommand;
        do {
            currentCommand = scanner.nextLine();
            myBrowser.executeCommand(currentCommand);
        } while(!currentCommand.equals("Home"));
    }
}