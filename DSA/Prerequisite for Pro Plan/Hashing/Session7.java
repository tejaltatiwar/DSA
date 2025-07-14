//Find largest/smallest subarray with sum k in Given Array

import java.util.HashMap;
import java.util.Scanner;

class Session7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        // //bruteforce approach
        // int largestSum = 0;
        // int smallestSum = n;
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += arr[j];
        //         if (sum == k) {
        //             largestSum = Math.max(largestSum, j - i + 1);
        //             smallestSum = Math.min(smallestSum, j - i + 1);
        //         }
        //     }
        // }
        // System.out.println("Largest subarray with sum k is with indexes " + largestSum);
        // System.out.println("Smallest subarray with sum k is with indexes" + smallestSum);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int sum = 0;
        int largestSum = 0;
        int smallestSum = n + 1; // Initialize to a value larger than any possible subarray length
        hmap.put(0, -1); // To handle the case when the subarray starts from index 0
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // Check if there is a subarray with sum k
            if (hmap.containsKey(sum - k)) {
                int length = i - hmap.get(sum - k);
                largestSum = Math.max(largestSum, length);
                smallestSum = Math.min(smallestSum, length);
            }

            // Store the first occurrence of the sum
            if (!hmap.containsKey(sum)) {
                hmap.put(sum, i);
            }
        }

        System.out.println("Largest subarray with sum k is of length: " + largestSum);

        System.out.println("Smallest subarray with sum k is of length: " + smallestSum);

    }

}
