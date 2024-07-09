// Breaking the Records
// Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyClass {
    public static void main(String args[]) {
      
        // Initialize scanner to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int n = sc.nextInt();
        
        // Initialize array to store elements
        int[] arr = new int[n];
        
        // Read elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Initialize variables to track min, max values and their counts
        int min = arr[0];
        int max = arr[0];
        int minCount = 0;
        int maxCount = 0;
        
        // Iterate through the array to find min, max and their counts
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxCount++;
            } else if (arr[i] < min) {
                min = arr[i];
                minCount++;
            }
        }
        
        // Print the counts of min and max values found
        System.out.print(maxCount + " " + minCount);
    }
}
