// Write a program to input a three digit number. Use a method int Armstrong(int n) to accept the number. The method returns 1, if the number is Armstrong, otherwise zero(0).
// Sample Input: 153
// Sample Output: 153 ⇒ 13 + 53 + 33 = 153
// It is an Armstrong Number.

import java.util.Scanner;

public class ARM_Num
{
    public int armstrong(int n) { 
        int num = n, cubeSum = 0;   
        while (num > 0) {
            int digit = num % 10;
            cubeSum = cubeSum + (digit * digit * digit);
            num /= 10;
        }
        if (cubeSum == n)
            return 1;
        else
            return 0;
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        ARM_Num obj = new ARM_Num();
        int r = obj.armstrong(num);
        if (r == 1)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}