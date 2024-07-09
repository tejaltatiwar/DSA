// Staircase
// This is a staircase of size :

//    #
//   ##
//  ###
// ####
// Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt() ;
      for(int i=0;i<n;i++){
          for(int j=0;j<n-i-1;j++){
              System.out.print(" ");
          }
          for(int k=0;k<i+1;k++){
               System.out.print("#");
          } System.out.println();
      } 
      
      
    }
}
