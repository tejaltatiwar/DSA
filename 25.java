// Viral Advertising
// HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly  people on social media.

// On the first day, half of those  people (i.e., ) like the advertisement and each shares it with  of their friends. At the beginning of the second day,  people receive the advertisement.

// Each day,  of the recipients like the advertisement and will share it with  friends on the following day. Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day .

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt() ;
      int shared=5;
      int liked=2;
      int cumulative=2;
      for(int i=1;i<n;i++){
          shared=Math.floorDiv(shared, 2)*3;
          liked=Math.floorDiv(shared, 2);
          cumulative+=liked;
      }System.out.print(cumulative);
    }
}
