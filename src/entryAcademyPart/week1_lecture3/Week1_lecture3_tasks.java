package entryAcademyPart.week1_lecture3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Week1_lecture3_tasks {
    private static void task1() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < n; i+=2) {
            System.out.println(i);
        }
    }
    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m;
        do {
            m = Integer.parseInt(scanner.nextLine());
        } while (n < m);
        for (int i = 0; i < n; i+=m) {
            System.out.println(i);
        }
    }
    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
    private static void task6() {
        final char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(word.charAt(i) == vowels[j]) {
                    sum += (j + 1);
                }
            }
        }

        System.out.println(sum);
    }
    private static void task7() {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.printf("%d:%d%n", i, j);
            }
        }
    }
    private static void task8() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
        }
    }
    private static void task9() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOfEvens = 0;
        for(int i = 1; n != 0; ++i) {
            if(i % 2 == 0) {
                sumOfEvens += i;
                n--;
            }
        }
        System.out.println(sumOfEvens);
    }
    private static void task10() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
    private static void task11() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        int revN = Integer.parseInt(reversed.toString());
        System.out.println(revN);
    }
    private static int fibonacci(int number) {
        if(number == 0) {
            return 0;
        }

        if(number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number -2);
    }
    private static void task12() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = Integer.parseInt(scanner.nextLine());
        } while(number < 0);
        int fibonacciSum = 0;
        for(int i = 1; i <= number; ++i) {
            fibonacciSum += fibonacci(i);
        }
        System.out.println(fibonacciSum);
    }
    private static void task13() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        System.out.println(word.contentEquals(reversed));
    }
    private static boolean isDigit(char symbol) {
        return '0' <= symbol && symbol <= '9';
    }
    private static int countDigits(String word) {
        int countDigits = 0;
        for (int i = 0; i < word.length(); i++) {
            if(isDigit(word.charAt(i))) {
                countDigits++;
            }
        }

        return countDigits;
    }

    private static int sumDigits(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if(isDigit(word.charAt(i))) {
                sum += (word.charAt(i) - '0');
            }
        }

        return sum;
    }
    private static boolean isArmstrongNumber(String word) {
        return Integer.parseInt(word) == Math.pow(sumDigits(word), countDigits(word));
    }
    private static void task14() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(isArmstrongNumber(input));
        System.out.println(isArmstrongNumber(input) ?
                "Armstrong" : "Not Armstrong");
    }
    private static ArrayList<Integer> makeCollatz(int number, ArrayList<Integer> numbers, int i) {
        if(i < 1) {
            numbers.add(number);
        }
        if(number == 1) {
            return numbers;
        }
        if(number % 2 == 0) {
            number /= 2;
            numbers.add(number);
            return makeCollatz(number, numbers, ++i);
        }
        number  = number * 3 + 1;
        numbers.add(number);
        return makeCollatz(number, numbers, ++i);
    }
    private static void task15() {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> lst = new ArrayList<>();
        int index = 0;
        System.out.println(Arrays.toString(makeCollatz(startNumber, lst, index).toArray()));
    }
    private static void task16() {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        do {
            n = Integer.parseInt(scanner.nextLine());
            m = Integer.parseInt(scanner.nextLine());
        } while(n < 0 || m < 0);

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if(row == 0 || row == n - 1) {
                    System.out.print('*');
                    continue;
                }
                if((col == 0 || col == m - 1)) {
                    System.out.print('*');
                    continue;
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    private static void task17() {
        Scanner scanner = new Scanner(System.in);
        int floorsNumber;
        do {
            floorsNumber = Integer.parseInt(scanner.nextLine());
        } while (floorsNumber <= 0);
        int roomsNumber;
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
    private static void task18() {
        Scanner scanner = new Scanner(System.in);
        int intervalStart;
        do {
            intervalStart = Integer.parseInt(scanner.nextLine());
        } while (intervalStart < 1 || 999 < intervalStart);
        int intervalEnd;
        do {
            intervalEnd = Integer.parseInt(scanner.nextLine());
        } while (intervalEnd < intervalStart || 1000 < intervalEnd);
        int magicNumber;
        do {
            magicNumber = Integer.parseInt(scanner.nextLine());
        } while (magicNumber < 1 || 10000 < magicNumber);

        int combinationsCount = 0;
        for (int first = intervalStart; first <= intervalEnd; first++) {
            for (int second = intervalStart; second <= intervalEnd; second++) {
                combinationsCount++;
                if(first + second == magicNumber) {
                    System.out.printf("Combination %d - (%d + %d = %d)",
                            combinationsCount, first, second, magicNumber);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d",
                combinationsCount, magicNumber);
    }
    // TODO: to implement from task 19 to task 21 for exercise before the exam
    private static void task22() {
        IntStream.
                rangeClosed(1, 1000).
                mapToObj(i -> i + "").
                filter(number -> number.endsWith("7")).
                forEach(System.out::println);
    }
    private static void task23() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 0 || 9 < n);
        for (int i = 1; i <= 1000; i++) {
            if((i + "").endsWith(n + "")) {
                System.out.println(i);
            }
        }
    }
    // TODO: to implement from task 24 to task 29 for exercise before the exam
    private static void task30() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void task31() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    int asterisksCount = i;
                    while(0 <= asterisksCount) {
                        System.out.print("* ");
                        asterisksCount--;
                    }
                }
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if(i == j) {
                    int asterisksCount = i;
                    while(0 <= asterisksCount) {
                        System.out.print("* ");
                        asterisksCount--;
                    }
                }
            }
            System.out.println();
        }
    }
    private static void task32() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int spaces = n / 2;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(" *");
            }
            System.out.println();
            if (i <= n / 2) {
                spaces--;
                stars++;
            } else {
                spaces++;
                stars--;
            }
        }
    }
    // TODO: to implement from task 33 to task 44 for exercise before the exam
    private static boolean areEvensAndOddsSumsEqual(int number) {
        String sequence = number + "";
        int sum = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if(i % 2 == 0) {
                sum += (sequence.charAt(i) - '0');
            } else {
                sum -= (sequence.charAt(i) - '0');
            }
        }

        return sum == 0;
    }
    private static void task45() {
        Scanner scanner = new Scanner(System.in);
        int fstNum;
        do {
            fstNum = Integer.parseInt(scanner.nextLine());
        } while (fstNum < 100000 || 300000 < fstNum);
        int sndNum;
        do {
            sndNum = Integer.parseInt(scanner.nextLine());
        } while (sndNum < fstNum || 300000 < sndNum);

        int numbersCount = 0;
        for (int number = fstNum; number <= sndNum; number++) {
            if(areEvensAndOddsSumsEqual(number)) {
                System.out.println(number);
                numbersCount++;
            }
        }
        if(numbersCount == 0) {
            System.out.println("None");
        }

        System.out.println();
    }
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
    private static void task46() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        LinkedList<char[]> passwords = generateAllPasswords(n, l);
        for (char[] pass : passwords) {
            System.out.println(pass);
        }
    }
    // TODO: to implement from task 47 for exercise before the exam
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task22();
        task23();
        task30();
        task31();
        task32();
        task45();
        task46();
    }
}