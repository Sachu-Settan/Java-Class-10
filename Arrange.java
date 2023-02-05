// Chapter 7 Question 4

import java.util.Scanner;

public class Arrange
{
    private String str;
    private String i;
    private int p;
    private char ch;
    
    public Arrange(String s) {
        str = s;
        i = "";
        p = s.length();
        ch = 0;
    }
    
    public void rearrange() {
        for (int a = 65; a <= 90; a++) {
            for (int j = 0; j < p; j++) {
                ch = str.charAt(j);
                if (a == Character.toUpperCase(ch))
                    i += ch;
            }
        }
    }
    
    public void display() {
        System.out.println("Alphabets in ascending order:");
        System.out.println(i);
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.nextLine();
    
        Arrange ob = new Arrange(word);
        ob.rearrange();
        ob.display();
    }
}