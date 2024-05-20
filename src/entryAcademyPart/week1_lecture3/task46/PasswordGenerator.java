package entryAcademyPart.week1_lecture3.task46;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class PasswordGenerator {
    private static LinkedList<char[]> generateAllPasswords(int n, int l) {
        LinkedList<char[]> passwords = new LinkedList<>();
        char[] lowerCaseAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] currentPassword = new char[5];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 0; k < l; k++) {
                    for (int m = 0; m < l; m++) {
                        for (int o = Math.max(i, j); o < n; o++) {
                            currentPassword[0] = (char)(i - '0');
                            currentPassword[1] = (char)(j - '0');
                            currentPassword[2] = lowerCaseAlphabet[k];
                            currentPassword[3] = lowerCaseAlphabet[o];
                            currentPassword[4] = (char)(o - '0');
                            passwords.add(currentPassword);
                            currentPassword = new char[5];
                        }
                    }
                }
            }
        }

        return passwords;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        LinkedList<char[]> passwords = generateAllPasswords(n, l);
        for (char[] pass : passwords) {
            System.out.println(pass);
        }
    }
}