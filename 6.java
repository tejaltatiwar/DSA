// Birthday Cake Candles

// You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt() ;
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      } 
      int highest=0;
      int count=0;
      for(int i=0;i<n;i++){
          if(highest<arr[i]){
              highest=arr[i];
          }
       }
       for(int i=0;i<n;i++){
           if(arr[i]==highest){
               count++;
           }
       }
       
      System.out.println(count);
    }
}
