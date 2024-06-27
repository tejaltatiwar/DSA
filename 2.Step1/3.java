// Diagonal Difference
// Given a square matrix, calculate the absolute difference between the sums of its diagonals.

// For example, the square matrix  is shown below:

// 1 2 3
// 4 5 6
// 9 8 9  
// The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
// int arr[n][m]: an array of integers
// int: the absolute diagonal difference=2

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int arr[][]=new int[n][n];
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              arr[i][j]=sc.nextInt();
          }
      } 
      int leftdSum=0;
      int rightdSum=0;
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(i==j){
                  leftdSum+=arr[i][j];
              }
              if(i+j==n-1){
                    rightdSum+=arr[i][j];
              }
          }
      }
      
      int diagodiff=0;
      if(leftdSum>rightdSum){
          diagodiff+=(leftdSum-rightdSum);
      }else{
           diagodiff+=(rightdSum-leftdSum);
      }
      System.out.println(diagodiff);
    }
}
