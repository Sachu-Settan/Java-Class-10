// Write a program in Java to store 10 numbers (including positive and negative numbers) in a Single Dimensional Array (SDA). Display all the negative numbers followed by the positive numbers without changing the order of the numbers.

import java.util.Scanner;
public class Numbers
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0)
                System.out.print(arr[i] + ", ");
        }
    }
}