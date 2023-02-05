// Write a program to input a sentence and display the word of the sentence that contains maximum number of vowels.
// Sample Input: HAPPY NEW YEAR
// Sample Output: The word with maximum number of vowels: YEAR

import java.util.Scanner;
public class VowelWord
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        str = str + " ";
        String word = "", mWord = "";
        int count = 0, maxCount = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if (ch == 'A' ||
                ch == 'E' ||
                ch == 'I' ||
                ch == 'O' ||
                ch == 'U') {
                count++; 
            }
            if (ch == ' ') {
                if (count > maxCount) {
                    maxCount = count;
                    mWord = word;
                }
                word = "";
                count = 0;
            }
            else {
                word += ch;
            }
        }
        System.out.println("The word with maximum number of vowels: "+ mWord);
    }
}