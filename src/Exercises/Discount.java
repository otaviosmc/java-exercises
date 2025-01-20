package Exercises;

public class Discount {
    public static double originalPrice = 10;
    public static double discountPercentual = 10;

    public static double priceWithDiscount = originalPrice-((originalPrice/100) * discountPercentual);

    public static void main(String[]args){
        System.out.println("The price with discount is R$ " + priceWithDiscount);
    }
}

/*Declare a variable in double type 'originalPrice'. Attribute a value in brasilian real to this variable, representating
the original product price. So declare a variable in double type 'discountPercentual' and attribute a percentual discount value
to product (for example, 10 for 10%). Calculate the discount value in brasilian real, apply it to the original price and
print the new price with discount.*/