// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// D E
// C D E
// B C D E
// A B C D E


import java.util.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
           {
               for(int j=i;j>=0;j--)
                   {
                       System.out.print((char)(65+n-j-1)+" ");
                   }
               System.out.println(); 
           }
    }
}
