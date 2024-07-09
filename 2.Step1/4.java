// Plus Minus
// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
// Print
// Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with 6 digits after the decimal. The function should not return a value.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int pos=0 ;
      int neg=0 ; 
      int zero=0 ;
      
      for(int i=0;i<n;i++){
          if(arr[i]>0){
              pos++;
          }else if(arr[i]<0){
              neg++;
          }else{
              zero++;
          }
      } 
      double posRatio=pos/(1.0*n);
      double negRatio=(double)neg/n;
      double zerRatio=(double)zero/n;
      
      System.out.println(String.format( "%.6f", posRatio));
      System.out.println(String.format( "%.6f", negRatio));
      System.out.println(String.format( "%.6f", zerRatio));



    }
}
