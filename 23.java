// Beautiful Days at the Movies

// Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .

// She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

// Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int i=sc.nextInt();
      int j=sc.nextInt(); 
      int k=sc.nextInt() ;
      
      
      int count=0;
      for(int l=i;l<=j;l++){
          int n=l;
          int rev=0;
          while(n>0){
             int rem=n%10;
             rev=rev*10+rem;
             n/=10;
          }
          if(Math.abs(l-rev)%k==0){
              count++;
          }
      }System.out.print(count);
    }
}
