// Write a program in Java to enter a String/Sentence and display the longest word and the length of the longest word present in the String.
// Sample Input: “TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN”
// Sample Output: The longest word: FOOTBALL: The length of the word: 8

import java.util.Scanner;
public class LWord
{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a word or sentence:");
       String str = in.nextLine();
       str += " "; //Add space at end of string
       String word = "", lWord = "";
       int len = str.length();
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           if (ch == ' ') {
                if (word.length() > lWord.length())
                    lWord = word;
                word = "";
           }
           else {
               word += ch;
           }
       }
       System.out.println("The longest word: " + lWord +
        ": The length of the word: " + lWord.length());
    }
    
}