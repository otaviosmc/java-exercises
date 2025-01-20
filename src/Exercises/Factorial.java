package Exercises;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Fill the number");
        int number = scanner.nextInt();

        for (int i = number -1; i > 0 ; i--) {
            number*= i;
            System.out.println(number);
        }
    }
}
