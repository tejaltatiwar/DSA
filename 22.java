// Angry Professor
// A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time () to arrived late ().

// Given the arrival time of each student and a threshhold number of attendees, determine if the class is cancelled.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    
    public static void main(String args[]) {
      
      
      Scanner sc= new Scanner(System.in);
      int t= sc.nextInt();
      for(int i =0;i<t;i++){
          int n= sc.nextInt();
          int k=sc.nextInt();
          int arr[]=new int[n];
          int befTime=0;
          int late=0;
          for(int j=0;j<n;j++){
              arr[j]=sc.nextInt();
              if(arr[j]<=0){
                  befTime++;
              }else{
                  late++;
              }
          }
        
            if(befTime>=k){
                System.out.println("NO");
                
            }
            else{
                System.out.println("YES");
            }
        
     }
  }
}
