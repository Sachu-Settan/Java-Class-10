// Write a program in Java to find the roots of a quadratic equation ax2+bx+c=0 with the following specifications:

// Class name — Quad

// Data Members — float a,b,c,d (a,b,c are the co-efficients & d is the discriminant), r1 and r2 are the roots of the equation.

// Member Methods:

// quad(int x,int y,int z) — to initialize a=x, b=y, c=z, d=0
// void calculate() — Find d=b2-4ac
// If d < 0 then print "Roots not possible" otherwise find and print:
// r1 = (-b + √d) / 2a
// r2 = (-b - √d) / 2a

import java.util.Scanner;

public class Quad
{
    private float a;
    private float b;
    private float c;
    private float d;
    private float r1;
    private float r2;

    public Quad(float x, float y, float z)
    {
        a = x;
        b = y;
        c = z;
        d = 0;
    }

    public void calculate() {
        d= (b * b) - (4 * a * c);
        if (d < 0)
            System.out.println("Roots not possible");
        else {
            r1 = (float)((-b + Math.sqrt(d)) / (2 * a));
            r2 = (float)((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("r1=" + r1);
            System.out.println("r2=" + r2);
        }
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        float x = in.nextFloat();
        System.out.print("Enter b: ");
        float y = in.nextFloat();
        System.out.print("Enter z: ");
        float z = in.nextFloat();
        
        Quad ob = new Quad(x,y,z);
        ob.calculate();
    }
}