// Write a program to accept a list of 20 integers. Sort the first 10 numbers in ascending order and next the 10 numbers in descending order by using 'Bubble Sort' technique. Finally, print the complete list of integers.

import java.util.Scanner;

public class BubbleSort
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        System.out.println("Enter 20 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        //Sort first half in ascending order
        for (int i = 0; i < arr.length / 2 - 1; i++) {
            for (int j = 0; j < arr.length / 2 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }  
        }
        //Sort second half in descending order
        for (int i = 0; i < arr.length / 2 - 1; i++) {
            for (int j = arr.length / 2; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }  
        }
        //Print the final sorted array
        System.out.println("\nSorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}