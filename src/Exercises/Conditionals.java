package Exercises;

import java.util.Random;
import java.util.Scanner;

public class Conditionals {

    public static int randomNumber = new Random().nextInt(100);
    public static boolean rightAnswer = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill the number");
        System.out.println(randomNumber);
        while (!rightAnswer){
            int numero = scanner.nextInt();
            if (numero == randomNumber){
                System.out.println("Congratulations! You did it!");
                rightAnswer = true;
                break;
            } else{
                System.out.println("You didn't get the right number, try again.");
            }
        }
    }
    }

/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e
pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop. */