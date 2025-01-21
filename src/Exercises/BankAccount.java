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
            System.out.println("*****************************************\nChoose an option:\n1- Check balance\n2- Receive transfer\n3- Transfer\n4- Exit\n*****************************************");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Your balance is $ " + balance + "\n1- Back");
                    int back = scanner.nextInt();

                    if (back == 1){
                        break;
                    }
                case 2:
                    System.out.println("Fill the value that you received");
                    double receivedValue = scanner.nextDouble();

                    balance += receivedValue;

                    System.out.println("Transfer received succesfully\n1- Back");
                    System.out.println("");

                    int backCaseTwo = scanner.nextInt();
                    if (backCaseTwo == 1){
                        break;
                    }
                case 3:
                    System.out.println("Fill the value that you want transfer");
                    double transferedValue = scanner.nextDouble();

                    balance -= transferedValue;

                    System.out.println("Transfer made succesfully\n1- Back");

                    int backCaseThree = scanner.nextInt();
                    if (backCaseThree == 1){
                        break;
                    }
            }
        }
    }
}
