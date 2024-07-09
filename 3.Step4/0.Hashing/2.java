// Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j] 


// Brute Force Approach:- Iterate over all i and j and check if(arr[i] + arr[j] == k), increment cnt by 1. At the end, print this total Count

// import java.util.*;

// public class Main {
//     public static int bruteForceCountPairs(int[] arr, int k) {
//         int count = 0;
//         for (int i = 0; i < arr.length - 1; ++i) {
//             for (int j = i + 1; j < arr.length; ++j) {
//                 if (arr[i] + arr[j] == k) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int k = 6;
//         System.out.println("Count of pairs: " + bruteForceCountPairs(arr, k));
//     }
// }
