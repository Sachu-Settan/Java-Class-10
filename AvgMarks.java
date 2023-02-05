// Write a program to input and store roll numbers, names and marks in 3 subjects of n number of students in five single dimensional arrays and display the remark based on average marks as given below:

// Average     	Remark
// 85 - 100	  Excellent
// 75 - 84	     Distinction
// 60 - 74	     First Class
// 40 - 59	        Pass
// Less than 40	Poor


import java.util.Scanner;
public class AvgMarks
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        int rollNo[] = new int[n];
        String name[] = new String[n];
        int s1[] = new int[n];
        int s2[] = new int[n];
        int s3[] = new int[n];
        double avg[] = new double[n];
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
            avg[i] = (s1[i] + s2[i] + s3[i]) / 3.0;
        }
        System.out.println("Roll No\tName\tRemark");
        for (int i = 0; i < n; i++) {
            String remark;
            if (avg[i] < 40) 
                remark = "Poor";
            else if (avg[i] < 60)
                remark = "Pass";
            else if (avg[i] < 75)
                remark = "First Class";
            else if (avg[i] < 85)
                remark = "Distinction";
            else
                remark = "Excellent";
            System.out.println(rollNo[i] + "\t" 
                + name[i] + "\t" 
                + remark);
        }
    }
}