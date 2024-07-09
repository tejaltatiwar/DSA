// Time Conversion
// Given a time in -hour AM/PM format, convert it to military (24-hour) time.

// Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
// - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

// string: the time in 24 hour format

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      String time=sc.nextLine();
      String start=time.substring(0,2);
      int hour=Integer.parseInt(start);
      String end= time.substring(2,8);
      
      
      if(time.contains("P")&&hour<12){
          hour+=12;
          start=String.valueOf(hour);
      }else if(time.contains("A")&& hour==12){
          start="00";
      }
      
      System.out.println(start+end);
    }
}


