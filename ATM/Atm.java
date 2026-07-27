package ATM;

import java.util.Scanner;

public class Atm {

    private Account account;
    private Scanner scanner;

    private static final int CHECK_BALANCE = 1;
    private static final int DEPOSIT = 2;
    private static final int WITHDRAW = 3;
    private static final int EXIT = 4;

    public Atm(Account account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            displayMenu();

            System.out.print("Enter Choice : ");

            choice = scanner.nextInt();

            switch (choice) {

                case CHECK_BALANCE:
                    checkBalance();
                    break;

                case DEPOSIT:
                    depositMoney();
                    break;

                case WITHDRAW:
                    withdrawMoney();
                    break;

                case EXIT:
                    System.out.println("\nThank You For Using Our ATM.");
                    break;

                default:
                    System.out.println("\nInvalid Choice.");
            }

        } while (choice != EXIT);

    }

    private void displayMenu() {

        System.out.println("\n===========================");
        System.out.println("         ATM MENU");
        System.out.println("===========================");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("===========================");

    }

    private void checkBalance() {

        System.out.printf("Current Balance : $%.2f%n", account.getBalance());

    }

    private void depositMoney() {

        System.out.print("Enter Deposit Amount : ");

        double amount = scanner.nextDouble();

        if (account.deposit(amount)) {

            System.out.println("Deposit Successful.");

            checkBalance();

        } else {

            System.out.println("Invalid Amount.");

        }

    }

    private void withdrawMoney() {

        System.out.print("Enter Withdrawal Amount : ");

        double amount = scanner.nextDouble();

        if (account.withdraw(amount)) {

            System.out.println("Withdrawal Successful.");

            checkBalance();

        } else {

            System.out.println("Transaction Failed.");
            System.out.println("Check Balance or Amount.");

        }

    }

}