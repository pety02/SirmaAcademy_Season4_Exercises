package professionalAcademyPart.week3_lecture1.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CommandInterpreter<String> interpreter = new CommandInterpreter<>(new CustomList<String>());
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cmdLines = new ArrayList<>();
        String cmd;
        do {
            cmd = scanner.nextLine();
            cmdLines.add(cmd);
        } while(!cmd.equals("end"));
        for (String cmdLine : cmdLines) {
            interpreter.interpret(cmdLine);
        }
        System.exit(0);
    }
}