// Write a program to input a number and check and print whether it is a 'Pronic' number or not. Use a method int Pronic(int n) to accept a number. The method returns 1, if the number is 'Pronic', otherwise returns zero (0).
// (Hint: Pronic number is the number which is the product of two consecutive integers)
// Examples:
// 12 = 3 * 4
// 20 = 4 * 5
// 42 = 6 * 7

import java.util.Scanner;

public class Pronic
{
    public int pronic(int n) {
        int isPronic = 0;
        for (int i = 1; i <= n - 1; i++) {
            if (i * (i + 1) == n) {
                isPronic = 1;
                break;
            }
        }
        return isPronic;
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = in.nextInt();
        Pronic obj = new Pronic();
        int r = obj.pronic(num);
        if (r == 1)
            System.out.println(num + " is a pronic number");
        else
            System.out.println(num + " is not a pronic number");
        
    }
}