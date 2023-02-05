// To get promotion in a Science stream, a student must pass in English and should pass in any of the two subjects (i.e.; Physics, Chemistry or Maths). The passing mark in each subject is 35. Write a program in a Single Dimension Array to accept the roll numbers and marks secured in the subjects for all the students. The program should check and display the roll numbers along with a message whether "Promotion is Granted" or "Promotion is not Granted". Assume that there are 40 students in the class.

import java.util.Scanner;
public class Student
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int Details[] = new int[200]; //40 * 5 = 200 
        System.out.println("Enter student details");
        for (int i = 0, idx = 1; i < 200; i = i + 5, idx++) {
            System.out.print("Student " + idx + " roll number: ");
            Details[i] = in.nextInt();
            System.out.print("Student " + idx + " English Marks: ");
            Details[i+1] = in.nextInt();
            System.out.print("Student " + idx + " Maths Marks: ");
            Details[i+2] = in.nextInt();
            System.out.print("Student " + idx + " Physics Marks: ");
            Details[i+3] = in.nextInt();
            System.out.print("Student " + idx + " Chemistry Marks: ");
            Details[i+4] = in.nextInt();
        }
        for (int i = 0; i < 200; i = i + 5) {
            System.out.println("Roll No: " + Details[i]);
            if (Details[i+1] > 34 && 
                ((Details[i+2] > 34 && Details[i+3] > 34) ||
                (Details[i+2] > 34 && Details[i+4] > 34) ||
                (Details[i+3] > 34 && Details[i+4] > 34))) {
                System.out.println("Promotion is granted.");
            }
            else {
                System.out.println("Promotion is not granted.");
            }
        }
    }
}