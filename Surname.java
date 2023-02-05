// Write a program in Java to accept a name containing three words and display the surname first, followed by the first and middle names.
// Sample Input: MOHANDAS KARAMCHAND GANDHI
// Sample Output: GANDHI MOHANDAS KARAMCHAND

import java.util.Scanner;

public class Surname
{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a name of 3 words:");
       String name = in.nextLine();
       /*
        * Get the last index
        * of space in the string
        */
       String surname = name.substring(name.lastIndexOf(' ') + 1);
       String initialName = name.substring(0, name.lastIndexOf(' '));
       System.out.println("\n" + surname + " " + initialName);
    }
}