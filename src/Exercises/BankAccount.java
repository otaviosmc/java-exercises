package Exercises;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill your name.");
        String name = scanner.nextLine();

        System.out.println("Choose you account type:\n1- Current\n2- Savings");
        int account = scanner.nextInt();
        String accountName;

        if (account ==1){
            accountName = "Current";
        }else{
            accountName = "Savings";
        }

        System.out.println("What's your initial balance?");
        double balance = scanner.nextDouble();

        System.out.println("*****************************************");
        System.out.println("Name:              " + name);
        System.out.println("Account type:      " + accountName);
        System.out.println("Initial balance:   " + balance);
        System.out.println("*****************************************\n");

        int option = 0;
        while (option != 4) {
            System.out.println("*****************************************");
            System.out.println("Choose an option:\n1- Check balance\n2- Receive transfer\n3- Transfer\n4- Exit");
            System.out.println("*****************************************");
            option = scanner.nextInt();
        }
    }
}
