package Exercises;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======MENU======\nChoose an option to calcullate the area:\n1- Square\n2- Circle");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Fill the number of the side of the square.");
                double sideSquare = scanner.nextDouble();
                double squareArea = sideSquare * sideSquare;
                System.out.println("The area of the square is " + squareArea);
                break;
            case 2:
                System.out.println("Fill the number of the radius of the circle");
                double radiusValue = scanner.nextDouble();
                double circleArea = 3.14 * (radiusValue*radiusValue);
                System.out.println("The area of the circle is " + circleArea);
                break;
        }
    }
}

/* Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.
Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/