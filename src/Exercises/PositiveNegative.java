package Exercises;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill the number");
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is negative.");
        }
    }
}

/*Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/