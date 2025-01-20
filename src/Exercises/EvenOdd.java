package Exercises;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill the number");
        int number = scanner.nextInt();

        if((number^2) == 0){
            System.out.println("The number is even.");
        }else {
            System.out.println("The number is odd");
        }
    }
}

/*Crie um programa que solicite ao usuário a entrada de um número inteiro.
Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/