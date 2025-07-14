//Find count of shortest/largest subarrays with sum k in given array


import java.util.HashMap;
import java.util.Scanner;

class Session8 {

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
        // int currentSum = 0;
        // int largestCount = 0;
        // int smallestCount = 0;
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += arr[j];
        //         if (sum == k) {
        //             int len=j-i+1;
        //             if(len>largestSum){
        //                 largestSum=len;
        //                 largestCount = 1; // Reset count for new largest length=1;
        //             }   
        //             else if(len==largestSum){
        //                 largestCount++; // Increment count for same largest length
        //             }     
        //             if(len<smallestSum){
        //                 smallestSum=len;
        //                 smallestCount = 1; // Reset count for new smallest length=1;
        //             }   
        //             else if(len==smallestSum){
        //                 smallestCount++; // Increment count for same smallest length
        //             }

        //             largestSum = Math.max(largestSum, j - i + 1);
        //             smallestSum = Math.min(smallestSum, j - i + 1);
        //         }
        //     }
        // }
        // System.out.println("Largest subarray with sum k is with indexes " + largestSum+" with count: " + largestCount);
        // System.out.println("Smallest subarray with sum k is with indexes" + smallestSum  + " with count: " + smallestCount);
       
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int sum = 0;
        int largestSum = 0;
        int smallestSum = n + 1; // Initialize to a value larger than any possible subarray length
        int largestCount = 0;   
        int smallestCount = 0;
        hmap.put(0, -1); // To handle the case when the subarray starts from index 0
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // Check if there is a subarray with sum k
            if (hmap.containsKey(sum - k)) {
                int length = i - hmap.get(sum - k);
                if (length > largestSum) {
                    largestSum = length;
                    largestCount = 1;
                } else if (length == largestSum) {
                    largestCount++;
                }
                if (length < smallestSum) {
                    smallestSum = length;
                    smallestCount = 1;
                } else if (length == smallestSum) {
                    smallestCount++;
                }
            }

            // Store the first occurrence of the sum
            if (!hmap.containsKey(sum)) {
                hmap.put(sum, i);
            }
        }

        if (largestSum == 0) {
            System.out.println("No subarray with sum k found.");
        } else {
            System.out.println("Largest subarray with sum k is of length: " + largestSum + " with count: " + largestCount);
            System.out.println("Smallest subarray with sum k is of length: " + smallestSum + " with count: " + smallestCount);
        }

    }

}
