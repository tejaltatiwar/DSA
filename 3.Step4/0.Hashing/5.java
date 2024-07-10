//  Find Sum of Range  [l……….r] where(l<=r) using Prefix sum. 

// import java.util.*;

// public class Main {

//     static int bruteForceSum(int[] nums, int l, int r) {
//         int sum = 0;
//         for (int i = l; i <= r; ++i) {
//             sum += nums[i];
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

//         int l = 3, r = 7; // Example range [l, r]
//         System.out.println("Brute Force Sum: " + bruteForceSum(nums, l, r));
//     }
// }
// Time Complexity - O(N*Q) 
// For each query of l and r, we will call this getSum(), so Time Complexity will be O(n*q) where, q is the size of queries array containing different l and r values.





import java.util.*;

public class PrefixSum {

    static int[] prefixSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; ++i) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    static int optimizedSum(int[] prefix, int l, int r) {
        if (l == 0) {
            return prefix[r];
        }
        return prefix[r] - prefix[l - 1];
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] prefix = prefixSum(nums);

        int l = 2, r = 6; // Example range [l, r] in 0-based indexing
        System.out.println("Optimized Sum: " + optimizedSum(prefix, l, r));
    }
}
