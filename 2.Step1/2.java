// A Very Big Sum
// In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

// int ar[n]: an array of integers .
// Return
// long: the sum of all array elements
// Input Format
// The first line of the input consists of an integer .
// The next line contains  space-separated integers contained in the array.
// Output Format
// Return the integer sum of the elements in the array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      
      int n=sc.nextInt();
      long[] arr=new long[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextLong();
      }
      long sum=0;
      for(int i=0;i<n;i++){
          sum+=arr[i];
      }
      
      System.out.println(sum);
    }
}
