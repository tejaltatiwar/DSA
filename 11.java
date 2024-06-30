// Subarray Division
// Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

// Lily decides to share a contiguous segment of the bar selected such that:

// The length of the segment matches Ron's birth month, and,
// The sum of the integers on the squares is equal to his birth day.
// Determine how many ways she can divide the chocolate.



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
        
        // Read d and m values
        int d = sc.nextInt();
        int m = sc.nextInt();
        
        // Initialize count variable to store the number of subarrays
        int count = 0;
        
        // Iterate through the array to find subarrays of length m
        for (int i = 0; i <= n - m; i++) {
            int sum = 0;
            
            // Calculate the sum of the current subarray of length m
            for (int j = 0; j < m; j++) {
                sum += arr[i + j];
            }
            
            // If the sum matches d, increment the count
            if (sum == d) {
                count++;
            }
        }
        
        // Print the count of subarrays found
        System.out.println(count);
    }
}
