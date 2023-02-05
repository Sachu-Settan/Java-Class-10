// The annual examination result of 50 students in a class is tabulated in a Single Dimensional Array (SDA) is as follows:

// Write a program to read the data, calculate and display the following:
// (a) Average marks obtained by each student.
// (b) Print the roll number and the average marks of the students whose average is above. 80.
// (c) Print the roll number and the average marks of the students whose average is below 40.

import java.util.Scanner;

public class ExamResult
{
    public static void main(String args[]) {
        int TOTSTD = 50;
        Scanner in = new Scanner(System.in);
        int rollNo[] = new int[TOTSTD];
        int sA[] = new int[TOTSTD];
        int sB[] = new int[TOTSTD];
        int sC[] = new int[TOTSTD];
        double avg[] = new double[TOTSTD];
        for (int i = 0; i < TOTSTD; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = in.nextInt();
            System.out.print("Subject A Marks: ");
            sA[i] = in.nextInt();
            System.out.print("Subject B Marks: ");
            sB[i] = in.nextInt();
            System.out.print("Subject C Marks: ");
            sC[i] = in.nextInt();
            avg[i] = (sA[i] + sB[i] + sC[i]) / 3.0;
        }
        System.out.println("\nRoll No\tAverage Marks");
        for (int i = 0; i < TOTSTD; i++) {
            System.out.println(rollNo[i] + "\t" + avg[i]);
        }
        System.out.println("\nStudents with Average above 80:");
        for (int i = 0; i < TOTSTD; i++) {
            if (avg[i] > 80)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }
        System.out.println("\nStudents with Average below 40:");
        for (int i = 0; i < TOTSTD; i++) {
            if (avg[i] < 40)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }
    }
}