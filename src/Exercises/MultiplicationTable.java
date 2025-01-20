package Exercises;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill the number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number*i);
        }
    }
}

/*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/
