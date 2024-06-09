// Print the following pattern for the given N number of rows.
// Pattern for N = 3
// A
// BB
// CCC

import java.util.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      for(int i=0;i<n;i++)
         {
             for(int j=0;j<=i;j++)
                 {
                     System.out.print((char)(65+i)+" ");
                 }
             System.out.println();
         }
    }
}
