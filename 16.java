// Day of the Programmer
// Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the 256th day of the year) during a year in the inclusive range from 1700 to 2700.

// From 1700 to 1917, Russia's official calendar was the Julian calendar; since 1919 they used the Gregorian calendar system. The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.

// In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap year, and 28 days during all other years. In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar, leap years are either of the following:

// Divisible by 400.
// Divisible by 4 and not divisible by 100.
// Given a year, , find the date of the 256th day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc= new Scanner(System.in);
      int y=sc.nextInt();
      boolean leap= false;
      if(y==1918){
          System.out.print("26.09."+y);
      }
      else if(y<1918){
          if(y%4==0){
              System.out.print("12.09."+y);
          }else{
              System.out.print("13.09."+y);
          }
      }
      else{
      if(y%4==0){
          if(y%100==0){
              if(y%400==0){
                 leap=true; 
              }
              else{
                  leap=false;
              }
         }else{
             leap=true;
         }
      }
      else{
          leap=false;
      }
      
      
      if(leap==true){
          System.out.print("12.09."+y);
      }
      else{
          System.out.print("13.09."+y);
      }}
    }
}
