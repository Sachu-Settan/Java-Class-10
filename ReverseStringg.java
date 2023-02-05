// Write a program to accept a sentence. Display the sentence in reversing order of its word.
// Sample Input: Computer is Fun
// Sample Output: Fun is Computer

import java.util.Scanner;
public class ReverseStringg
{
   public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String str = in.nextLine();
       str = " " + str;
       String word = "";
       int len = str.length();
       for (int i = len - 1; i >= 0; i--) {
           char ch = str.charAt(i);
           if (ch == ' ') {
               System.out.print(word + " ");
               word = "";
           }
           else {
               word = ch + word;
           }
       }
   }
}