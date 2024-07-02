// Utopian Tree
// The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

// A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. How tall will the tree be after  growth cycles?



import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] testCases = new int[61];  // 1. Initialize array with length 61
        testCases[0] = 1;

        for (int i = 1; i <= 60; i++) {  // 2. Start loop from i = 1
            if (i % 2 == 0) {  // Correct conditions for even cycle
                testCases[i] = testCases[i - 1] + 1;
            } else {  // Correct conditions for odd cycle
                testCases[i] = 2 * testCases[i - 1];
            }
        }

        int n = sc.nextInt();  // 3. Read the number of test cases
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();  // Read each test case
            System.out.println(testCases[t]);  // Print the result
        }
        
        sc.close();
    }
}
