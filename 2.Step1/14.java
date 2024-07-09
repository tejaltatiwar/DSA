// Sales by Match

// There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++){
          map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }
      int count=0;
      for(Integer key:map.keySet()){
          count+=map.get(key)/2;
      }
      System.out.println(count);
    }
}
