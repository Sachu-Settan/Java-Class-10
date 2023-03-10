// Write a program in Java to enter a sentence. Display the words which are only palindrome.
// Sample Input: MOM AND DAD ARE NOT AT HOME
// Sample Output: MOM \n DAD

import java.util.Scanner;
public class Palin
{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String str = in.nextLine();
       str = str + " ";
       String word = "";
       int len = str.length();
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           if (ch == ' ') {
               int wordLen = word.length();
               boolean isPalin = true;
               for (int j = 0; j < wordLen / 2; j++) {
                   if (word.charAt(j) != word.charAt(wordLen - 1 - j)) {
                       isPalin = false;
                       break;
                   }
               }
               if (isPalin)
                    System.out.println(word); 
               word = "";
           }
           else {
               word += ch;
           }
       }
    }
}