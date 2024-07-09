// Bill Division

// Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

// For example, assume the bill has the following prices: . Anna declines to eat item  which costs . If Brian calculates the bill correctly, Anna will pay . If he includes the cost of , he will calculate . In the second case, he should refund  to Anna.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt() ;
      int k= sc.nextInt() ; 
      int arr[]=new int[n] ;
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int b= sc.nextInt();
      
      int actualMoney=0;
      int sum=0;
      for(int i=0;i<n;i++){
          if(i!=k){
              actualMoney+=arr[i];
          }sum+=arr[i];
      }
      int actualShare=actualMoney/2;
      if(b==actualShare){
          System.out.println("Bon Appetit");
      }else{
         System.out.println(sum/2-actualShare);
      }
    }
}
