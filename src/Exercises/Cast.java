package Exercises;

public class Cast {
    /*public static double doubleNumber = 7.6;
    public static int intNumber = (int) doubleNumber;*/

    public static int intNumber = 7;
    public static double doubleNumber = (double) intNumber;

    public static void main(String[]args){
        System.out.println("Double " + doubleNumber + "\nInt " + intNumber);
    }
}

//Declare a variable in the double type and a variable in the int type. Do the casting of the variable double to int and print the result.