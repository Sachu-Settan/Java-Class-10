
import java.util.*;
class Students{
    void main () {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter Number Of Students");
            int n = in.nextInt();
            float[] totalmarks = new float[n];
            String[] name = new String[n];
            float avg = 0.0f , sum = 0.0f;
            int i ;
            for ( i = 0; i < n ; i++ ){
                System.out.println( "Enter Name of student " + i + 1 );
                name[i] = in.nextLine();
                System.out.println( "Enter toatal mark of student "+ i+1 );
                totalmarks[i] = in.nextFloat();
            }
            for ( i = 0; i < n ; i++ ){
                sum += totalmarks[i];
            }
            avg = sum/n;
            for ( i = 0; i < n ; i++ ){
                System.out.println( "Deviation of " + i + " student from median =>" + (totalmarks[i] - avg) );
            }
        }
    }
}