// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// A
// B C
// C D E
// D E F G
import java.util.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
        int n=5;
       for(int i=0;i<n;i++)
     {
         for(int j=i;j<=2*i;j++)
            {
                System.out.print((char)(j+65)+" ");
            }
         System.out.println();
     }
    }
}