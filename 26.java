// Cut the sticks
// You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left. At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer sticks and then discard all the pieces of that shortest length. When all the remaining sticks are the same length, they cannot be shortened so discard them.

// Given the lengths of  sticks, print the number of sticks that are left before each iteration until there are none left.

import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int min = arr[0];
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(n); // Initially, all elements are counted
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > min) {
                min = arr[i];
                ans.add(n - i);
            }
        }
        
        for (int count : ans) {
            System.out.println(count);
        }
    }
}
