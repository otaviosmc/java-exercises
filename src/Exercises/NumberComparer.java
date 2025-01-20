package Exercises;

import java.util.Scanner;

public class NumberComparer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill the first number.");
        int firstNumber = scanner.nextInt();
        System.out.println("Fill the second number");
        int secondNumber = scanner.nextInt();

        if(firstNumber == secondNumber){
            System.out.println("Your numbers are equals.");
        }else {
            System.out.println("Your numbers are different.");
        }

        if (firstNumber > secondNumber) {
            System.out.println("Your first number is bigger than second number.");
        }
        else {
            System.out.println("Your second number is bigger than first number.");
        }
    }
}

/*Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais,
 diferentes, o primeiro é maior ou o segundo é maior.*/