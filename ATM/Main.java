package ATM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====== Welcome To ATM ======");

        System.out.print("Enter Initial Balance : ");

        double balance = scanner.nextDouble();

        Account account = new Account(balance);

        Atm atm = new Atm(account);

        atm.start();

        scanner.close();

    }

}