// Chapter 7 Question 2

import java.util.Scanner;
public class Laptop
{
    private String name;
    private int price;
    private double dis;
    private double amt;

    public Laptop(String s, int p)
    {
        name = s;
        price = p;
    }

    public void compute() {
        if (price <= 25000)
            dis = price * 0.05;
        else if (price <= 50000)
            dis = price * 0.075;
        else if (price <= 100000)
            dis = price * 0.1;
        else
            dis = price * 0.15;
            
        amt = price - dis;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Discount: " + dis);
        System.out.println("Amount to be paid: " + amt);
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String str = in.nextLine();
        System.out.print("Enter Price: ");
        int p = in.nextInt();
        
        Laptop ob = new Laptop(str,p);
        ob.compute();
        ob.display();
    }
}