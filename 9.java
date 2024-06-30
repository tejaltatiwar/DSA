// Number Line Jumps
// You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

// The first kangaroo starts at location  and moves at a rate of  meters per jump.
// The second kangaroo starts at location  and moves at a rate of  meters per jump.
// You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int x1= sc.nextInt() ;
      int v1= sc.nextInt() ;
      int x2= sc.nextInt() ;
      int v2= sc.nextInt() ;
      
//       speed = distance/jumps
// distance = speed * jumps
// After 'j' jumps/seconds both kangaroo reach same position
// Kangaroo 1 (startPosition = x1, jumpSpeed = v1) Kangaroo 2 (startPosition = x2, jumpSpeed = v2)
// Distance = v1 * j                       Distance = v2 * j
// Total Distance = (v1 * j) + x1           Total Distance = (v2 * j) + x2
    
//       x1+ (v1j) = x2 + (v2 * j)

//       x2-x1 = (v1-v2) * j
//        j = (x2 - x1) / (v1 - v2)
          
      
      //when speed is more and distance between them get 0
      if((v1>v2) && (x2-x1)%(v1-v2)==0 ){
          System.out.println("YES");
      }else{
           System.out.println("NO");
      }
    }
}
