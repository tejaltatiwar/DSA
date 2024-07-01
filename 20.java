// Electronics Shop
// A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return -1.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int b=sc.nextInt() ;
      int n=sc.nextInt() ; 
      int m=sc.nextInt();
     int keyboards[]=new int[n];
     for(int i=0;i<n;i++){
         keyboards[i]=sc.nextInt();   
      }
        int drives[]=new int[m];
     for(int i=0;i<m;i++){
         drives[i]=sc.nextInt();
     }

     Arrays.sort(keyboards);
     Arrays.sort(drives);
     
     int maxPrice=-1;
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             int sum=keyboards[i]+drives[j];
             if(sum>maxPrice && sum<=b){
                 maxPrice=sum;
             }
         }
     }System.out.print(maxPrice);
     
     
    }
}
