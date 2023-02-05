// Write a program by using a class with the following specifications:

// Class name — Hcflcm

// Data members/instance variables:
// int a
// int b

// Member Methods:
// Hcflcm(int x, int y) — constructor to initialize a=x and b=y.
// void calculate( ) — to find and print hcf and lcm of both the numbers.

import java.util.Scanner;

public class Hcflcm
{
    private int a;
    private int b;
    public Hcflcm(int x, int y) {
        a = x;
        b = y;
    }
    public void calculate() {
        int x = a, y = b;
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        int hcf = x;
        int lcm = (a * b) / hcf;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = in.nextInt();
        System.out.print("Enter second number: ");
        int y = in.nextInt();
        Hcflcm ob = new Hcflcm(x,y);
        ob.calculate();
    }
}