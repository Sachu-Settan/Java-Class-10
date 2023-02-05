// Write a program in Java using a method Discount( ), to calculate a single discount or a successive discount. Use overload methods Discount(int), Discount(int,int) and Discount(int,int,int) to calculate single discount and successive discount respectively. Calculate and display the amount to be paid by the customer after getting discounts on the printed price of an article.
// Sample Input:
// Printed price: ₹12000
// Successive discounts = 10%, 8%
// = ₹(12000 - 1200)
// = ₹(10800 - 864)
// Amount to be paid = ₹9936

import java.util.Scanner;

public class Discount
{
    public void discount(int price) {
        System.out.println("Amount after single discount = " + discount(price, 10));
        System.out.println("Amount after successive discount = " + discount(price, 10, 8));
    }
    
    public double discount(int price, int d) {
        double priceAfterDisc = price - price * d / 100.0;
        return priceAfterDisc;
    }
    
    public double discount(int price, int d1, int d2) {
        double priceAfterDisc1 = price - price * d1 / 100.0;
        double priceAfterDisc2 = priceAfterDisc1 - priceAfterDisc1 * d2 / 100.0;
        return priceAfterDisc2;
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter price: ");
        int price = in.nextInt();
        Discount obj = new Discount();
        
        obj.discount(price);
    }
}