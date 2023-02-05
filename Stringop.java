// Write a program by using a class in Java with the following specifications:
//
// Class name — Stringop
//
// Data members:
//
// String str
// Member functions:
//
// Stringop() — to initialize str with NULL
// void accept() — to input a sentence
// void encode() — to replace and print each character of the string with the second next character in the ASCII table. For example, A with C, B with D and so on
// void print() — to print each word of the String in a separate line


import java.util.Scanner;

public class Stringop
{
    private String str;

    public Stringop() {
        str = null;
    }

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        str = in.nextLine();
    }

    public void encode() {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = (char)(str.charAt(i) + 2);
        }
        str = new String(arr);
        System.out.println("\nEncoded Sentence:");
        System.out.println(str);
    }

    public void print() {
        System.out.println("\nPrinting each word on a separate line:");
        int s = 0;
        while (s < str.length()) {
            int e = str.indexOf(' ', s);
            if (e == -1)
                e = str.length();
            System.out.println(str.substring(s, e));
            s = e + 1;
        }
    }
    
    public static void main(String args[]) {
        Stringop ob = new Stringop();
        ob.accept();
        ob.print();
        ob.encode();
    }
}