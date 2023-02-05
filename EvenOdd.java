// Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer and store all the even numbers in an array even[ ] and all the odd numbers in another array odd[ ]. Finally, print the elements of both the arrays.

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String args[]) {
        int num = 20;
        Scanner in = new Scanner(System.in);
        int i = 0;
        int arr[] = new int[num];
        int even[] = new int[num];
        int odd[] = new int[num];
        System.out.println("Enter 20 numbers:");
        for (i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        int eIdx = 0, oIdx = 0;
        for (i = 0; i < num; i++) {
            if (arr[i] % 2 == 0)
                even[eIdx++] = arr[i];
            else
                odd[oIdx++] = arr[i];
        }
        System.out.println("Even Numbers:");
        for (i = 0; i < eIdx; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("\nOdd Numbers:");
        for (i = 0; i < oIdx; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}