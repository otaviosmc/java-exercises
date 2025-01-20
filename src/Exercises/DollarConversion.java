package Exercises;

public class DollarConversion {
    public static double dollarValues = 10.00;
    final static double DOLLAR_TO_REAL = 4.94;

    public static double conversionDollarToReal = dollarValues * DOLLAR_TO_REAL;

    public static void main(String[] args){
        System.out.println(String.format("%.2f", conversionDollarToReal));
    }
}

/*Declare a variable in the double type dollarValues. Attribute a value in dollar to this variable.
Consider that dollar value is equal 4.94 brasilian Real. Realize the conversion of the value in dollar to brasilian real
and print the formatted result.*/