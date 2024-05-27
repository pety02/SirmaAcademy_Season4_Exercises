package entryAcademyPart.week2_lecture2.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        int id, years;
        double amount, interestRate;
        BankAccount ba;
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        do {
            command = scanner.nextLine();

            if (command.equals("CREATE")) {
                ba = new BankAccount();
                System.out.println("Account ID" + ba.getId() + " created");
                bankAccounts.add(ba);
            } else if (command.equals("DEPOSIT")) {
                id = Integer.parseInt(scanner.nextLine());
                amount = Double.parseDouble(scanner.nextLine());
                boolean isFound = false;
                for (BankAccount currBankAccount : bankAccounts) {
                    if (id == currBankAccount.getId()) {
                        isFound = true;
                        currBankAccount.deposit(amount);
                        System.out.printf("Deposited %.2f to ID%d", amount, id);
                        break;
                    }
                }

                if(!isFound) {
                    System.out.println("Account does not exist");
                }
            } else if (command.equals("SET INTEREST")) {
                interestRate = Double.parseDouble(scanner.nextLine());
                BankAccount.setInterestRate(interestRate);
            } else if (command.equals("GET INTEREST")) {
                id = Integer.parseInt(scanner.nextLine());
                years = Integer.parseInt(scanner.nextLine());
                boolean isFound = false;
                for (BankAccount currBankAccount : bankAccounts) {
                    if (id == currBankAccount.getId()) {
                        isFound = true;
                        System.out.printf("%.2f%n", currBankAccount.getInterestRate(years));
                        break;
                    }
                }

                if(!isFound) {
                    System.out.println("Account does not exist");
                }
            }
        } while(!command.equals("END"));
    }
}