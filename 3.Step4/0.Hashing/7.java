Find largest/smallest subarray with sum k in Given Array


public class LargestSubarrayWithSumK {
    public static int findLargestSubarrayWithSumK(int[] nums, int k) {
        int maxLength = 0;

        for (int start = 0; start < nums.length; start++) {
            int currentSum = 0;
            for (int end = start; end < nums.length; end++) {
                currentSum += nums[end];

                if (currentSum == k) {
                    maxLength = Math.max(maxLength, end - start + 1);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, -2, -20, 10};
        int k = -10;
        int result = findLargestSubarrayWithSumK(nums, k);
        System.out.println("Length of the largest subarray with sum " + k + " is: " + result);
    }
}








