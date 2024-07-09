// The Hurdle Race
// A video player plays a game in which the character competes in a hurdle race. Hurdles are of varying heights, and the characters have a maximum height they can jump. There is a magic potion they can take that will increase their maximum jump height by  unit for each dose. How many doses of the potion must the character take to be able to jump all of the hurdles. If the character can already clear all of the hurdles, return .

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt() ;
      int k=sc.nextInt() ; 
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();   
      }
      int maxHeight=1;
      for(int i=0;i<n;i++){
          if(arr[i]>maxHeight){
              maxHeight=arr[i];
          }
      }
      if(maxHeight>k){
          System.out.println(maxHeight-k);
      }else{
          System.out.println(0);
      }
    }
}
