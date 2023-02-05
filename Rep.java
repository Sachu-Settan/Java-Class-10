// Write a program in Java to accept a String in upper case and replace all the vowels present in the String with Asterisk (*) sign.
// Sample Input: "TATA STEEL IS IN JAMSHEDPUR"
// Sample output: T*T* ST**L *S *N J*MSH*DP*R

import java.util.Scanner;

public class Rep
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string in uppercase:");
        String str = in.nextLine();
        String newStr = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == 'A' ||
            ch == 'E' ||
            ch == 'I' ||
            ch == 'O' ||
            ch == 'U') {
                newStr = newStr + '*';
            }
            else {
                newStr = newStr + ch;
            }
            
        }
        System.out.println(newStr);
    }
}