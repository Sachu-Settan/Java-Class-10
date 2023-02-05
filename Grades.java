
// Write a program in Java using arrays:
// (a) To store the Roll No., Name and marks in six subjects for 100 students.
// (b) Calculate the percentage of marks obtained by each candidate. The maximum marks in each subject are 100.
// (c) Calculate the Grade as per the given criteria:

// Percentage Marks	   Grade
// From 80 to 100	     A
// From 60 to 79	     B   
// From 40 to 59	     C 
// Less than 40	         D

import java.util.Scanner;
public class Grades
{
    public static void main(String args[]) {
        int n = 100;
        Scanner in = new Scanner(System.in);
        int rollNo[] = new int[n];
        String name[] = new String[n];
        int s1[] = new int[n];
        int s2[] = new int[n];
        int s3[] = new int[n];
        int s4[] = new int[n];
        int s5[] = new int[n];
        int s6[] = new int[n];
        double p[] = new double[n];
        char g[] = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = in.nextInt();
            in.nextLine();
            System.out.print("Name: ");
            name[i] = in.nextLine();
            System.out.print("Subject 1 Marks: ");
            s1[i] = in.nextInt();
            System.out.print("Subject 2 Marks: ");
            s2[i] = in.nextInt();
            System.out.print("Subject 3 Marks: ");
            s3[i] = in.nextInt();
            System.out.print("Subject 4 Marks: ");
            s4[i] = in.nextInt();
            System.out.print("Subject 5 Marks: ");
            s5[i] = in.nextInt();
            System.out.print("Subject 6 Marks: ");
            s6[i] = in.nextInt();
            p[i] = (((s1[i] + s2[i] + s3[i] + s4[i] 
                    + s5[i] + s6[i]) / 600.0) * 100);       
            if (p[i] < 40)
                g[i] = 'D';
            else if (p[i] < 60)
                g[i] = 'C';
            else if (p[i] < 80)
                g[i] = 'B';
            else
                g[i] = 'A';
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(rollNo[i] + "\t" 
                + name[i] + "\t" 
                + p[i] + "\t" 
                + g[i]);
        }
    }
}