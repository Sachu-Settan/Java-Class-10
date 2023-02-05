// Write a program in Java to accept a name(Containing three words) and display only the initials (i.e., first letter of each word).
// Sample Input: LAL KRISHNA ADVANI
// Sample Output: L K A

import java.util.Scanner;
public class NameInitials
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name of 3 or more words:");
        String str = in.nextLine();
        int len = str.length();
        System.out.print(str.charAt(0) + " ");
        for (int i = 1; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                char ch2 = str.charAt(i + 1);
                System.out.print(ch2 + " ");
            }
        }
    }
}