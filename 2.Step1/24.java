// Find Digits
// An integer  is a divisor of an integer  if the remainder of .

// Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int t= sc.nextInt();
      
      for(int i=0;i<t;i++){
          int count=0;
          int n=sc.nextInt();
          int m=n;
          for(int j=0;m>0;j++){
              int l=m%10;
              if(l==0){
                  
              }
              else if(n%l==0){
                  count++;
              }m/=10;
          }System.out.println(count);
      }
    }
}
