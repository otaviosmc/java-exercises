package Exercises;

public class Sum {
    public Integer FirstNumber;
    public Integer SecondNumber;

    public Integer SumNumbers(){
        return FirstNumber + SecondNumber;
    }

    public static void main(String[] args){
        Sum Sum1 = new Sum();
        Sum1.FirstNumber = 10;
        Sum1.SecondNumber = 5;

        System.out.println(Sum1.SumNumbers());
    }
}

//Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5.
//Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando
//o valor "15" ao invés da expressão "10+5".