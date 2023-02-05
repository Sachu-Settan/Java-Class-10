// The population of a country in a particular year can be calculated by:
// p*(1+r/100) at the end of year 2000, where p is the initial population and r is the
// growth rate.

// Write a program by using a class to find the population of the country at the end of each year from 2001 to 2007. The Class has the following specifications:

// Class name — Population

// Data Members — float p,r

// Member Methods:

// Population(int a,int b) — Constructor to initialize p and r with a and b respectively.
// void print() — to calculate and print the population of each year from 2001 to 2007.

import java.util.Scanner;
public class Population
{
    private float p;
    private float r;

    public Population(float a, float b)
    {
        p = a;
        r = b;
    }

    public void print() {
        float q = p;
        for (int y = 2001; y <= 2007; y++) {
            q = q * (1 + r / 100);
            System.out.println("Population in " + y + ": " + q);
        }
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter population in the year 2000: ");
        float x = in.nextFloat();
        System.out.print("Enter growth rate: ");
        float y = in.nextFloat();
        Population ob = new Population(x,y);
        ob.print();
    }
}