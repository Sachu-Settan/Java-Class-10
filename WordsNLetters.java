// Write a program to input a sentence. Find and display the following:
// (i) Number of words present in the sentence
// (ii) Number of letters present in the sentence
// Assume that the sentence has neither include any digit nor a special character.

import java.util.Scanner;
public class WordsNLetters
{
   public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String str = in.nextLine();
       int wCount = 0, lCount = 0;
       int len = str.length();
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           if (ch == ' ')
               wCount++;
           else
               lCount++;
       }
       /*
        * Number of words in a sentence are one more than
        * the number of spaces so incrementing wCount by 1
        */
       wCount++;
       System.out.println("No. of words = " + wCount);
       System.out.println("No. of letters = " + lCount);
   }
}