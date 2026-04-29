package ATM;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int balance=scn.nextInt();
        Account userAccount = new Account(balance); // initial balance
        Atm atm = new Atm(userAccount);
        atm.start();
    }
}