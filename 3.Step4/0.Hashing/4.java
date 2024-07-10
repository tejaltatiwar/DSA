// Count all i,j pairs where i<j and abs(b[i]-b[j]) = k [k>=0] 



import java.util.HashMap;
import java.util.Map;

public class CountPairsWithDifference {

    public static int countPairsWithDifferenceK(int[] b, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        int pairCount = 0;

        for (int num : b) {
            // Check if (num + k) or (num - k) exists in the hash map
            if (counts.containsKey(num + k)) {
                pairCount += counts.get(num + k);
            }
            if (k > 0 && counts.containsKey(num - k)) {
                pairCount += counts.get(num - k);
            }

            // Update the hash map with the current element
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        return pairCount;
    }

    public static void main(String[] args) {
        int[] b = {1, 5, 3, 4, 2};
        int k = 2;
        System.out.println(countPairsWithDifferenceK(b, k));  // Output: 3
    }
}
