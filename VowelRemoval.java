// Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.
// Sample Input: COMPUTER APPLICATIONS
// Sample Output: CMPTR PPLCTNS

import java.util.Scanner;
public class VowelRemoval
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word or sentence:");
        String str = in.nextLine();
        int len = str.length();
        String newStr = "";
        for (int i = 0; i < len; i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if (ch == 'A' ||
            ch == 'E' ||
            ch == 'I' ||
            ch == 'O' ||
            ch == 'U') {
                continue;
            }
            newStr = newStr + ch;
        }
        System.out.println("String with vowels removed");
        System.out.println(newStr);
    }
}