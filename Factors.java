// Write a program to enter a two digit number and find out its first factor excluding 1 (one). The program then find the second factor (when the number is divided by the first factor) and finally displays both the factors.
// Hint: Use a non-return type method as void fact(int n) to accept the number.
// Sample Input: 21
// The first factor of 21 is 3
// Sample Output: 3, 7
// Sample Input: 30
// The first factor of 30 is 2
// Sample Output: 2, 15

import java.util.Scanner;
public class Factors
{
    public void fact(int n) {
        if (n < 10 || n > 99) {
            System.out.println("ERROR!!! Not a 2-digit number");
            return;
        }
        int i;
        for (i = 2; i <= n; i++) {
            if (n % i == 0)
                break;
        }
        int sf = n / i;
        System.out.println(i + ", " + sf);
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        Factors obj = new Factors();
        obj.fact(num);
    }
}