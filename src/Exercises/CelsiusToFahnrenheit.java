package Exercises;

public class CelsiusToFahnrenheit {
    static double celsius;
    static double fahrenheit = (celsius * 1.8) + 32;

    public static void main (String[]args){
        System.out.println(String.format("A temperatura em Fahrenheit é: %.0f", fahrenheit));
    }
}
/*Escreva um programa que converta uma temperatura em graus
Celsius para Fahrenheit. Utilize variáveis para representar
os valores das temperaturas e imprima no console o valor
convertido de Celsius para Fahrenheit.*/