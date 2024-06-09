// Question 3.
// for n=3     
// pattern is 
// 1
// 2 2
// 3 3 3
// 
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
                     System.out.print((i+1)+" ");
                 }
             System.out.println();
         }
    }
}