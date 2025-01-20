package Exercises;

public class PriceCalc {
    public static double productPrice = 1.56;
    public static int quantity = 2;

    public static double totalPrice = productPrice * quantity;

    public static void main(String[]args){
        System.out.println("The total price is: $ " + totalPrice);
    }
}

/*Declare a variable in double type 'productPrice' and a variable in int type 'quantity'. Calculate the total price
multiplying the product price by the quantity and show the result in a message.*/

