// Grading Students
// HackerLand University has the following grading policy:

// Every student receives a  in the inclusive range from  to .
// Any  less than  is a failing grade.
// Sam is a professor at the university and likes to round each student's  according to these rules:

// If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
// If the value of  is less than , no rounding occurs as the result will still be a failing grade.
// Sample Input 0

// 4
// 73
// 67
// 38
// 33
// Sample Output 0
// 75
// 67
// 40
// 33

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      } 
      for(int i=0;i<n;i++){
           if(arr[i]>=38 && arr[i]%5>2){
              int rem=(5-arr[i]%5);
              arr[i]+=rem;

          }System.out.println(arr[i]);
      }
      
    }
}
9