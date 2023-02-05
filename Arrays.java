// Write a program to store 6 elements in an array P and 4 elements in an array Q. Now, produce a third array R, containing all the elements of array P and Q. Display the resultant array.

import java.util.Scanner;
public class Arrays
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int P[] = new int[6];
        int Q[] = new int[4];
        int R[] = new int[10];
        int i = 0;
        System.out.println("Enter 6 elements of array P:");
        for (i = 0; i < P.length; i++) {
            P[i] = in.nextInt();
        }
        System.out.println("Enter 4 elements of array Q:");
        for (i = 0; i < Q.length; i++) {
            Q[i] = in.nextInt();
        }
        i = 0;
        while(i < P.length) {
            R[i] = P[i];
            i++;
        }
        int j = 0;
        while(j < Q.length) {
            R[i++] = Q[j++];
        }
        System.out.println("Elements of Array R:");
        for (i = 0; i < R.length; i++) {
            System.out.print(R[i] + " ");
        }
    }
}
