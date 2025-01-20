package Exercises;

public class Subtraction {
    public Integer Num1;
    public Integer Num2;

    public Integer Subtract(){
        return Num1 - Num2;
    }

    public static void main(String[]args){
        Subtraction Sub1 = new Subtraction();

        Sub1.Num1 = 10;
        Sub1.Num2 = 5;

        System.out.println(Sub1.Subtract());
    }
}

//Crie uma classe Subtracao para imprimir o resultado de 10 - 5 no console.