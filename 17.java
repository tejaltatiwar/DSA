// Counting Valleys
// An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill, , or a downhill,  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:

// A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
// A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
// Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int steps=sc.nextInt();
      String path=sc.next() ; 
      
      int altitude=0;
      int numValley=0;
      for(int i=0;i<steps;i++){
          if(path.charAt(i)=='U'){
              if(altitude==-1){
                  numValley++;
              }
              altitude++;
          }
          if(path.charAt(i)=='D'){
              altitude--;
          }
      }System.out.print(numValley);
    }
}
