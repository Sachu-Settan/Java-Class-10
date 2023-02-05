// Write a program in Java to accept a word and display the ASCII code of each character of the word.
// Sample Input: BLUEJ
// Sample Output:
// ASCII of B = 66
// ASCII of L = 76
// ASCII of U = 85
// ASCII of E = 69
// ASCII of J = 74

import java.util.Scanner;

public class ASCII
{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a word:");
       String word = in.nextLine();
       int len = word.length();
       for (int i = 0; i < len; i++) {
           char ch = word.charAt(i);
           System.out.println("ASCII of " + ch  
            + " = " + (int)ch);
       }
    }
}