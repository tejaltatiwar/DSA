//Valid Anagram-LEETCODE
import java.util.HashMap;

class Session9 {
    public boolean isAnagram(String s, String t) {
        // Step 1: If the lengths are not equal, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        /*
        -----------------------------
        Brute-force Approach (Sorting)
        -----------------------------
        
        // Convert both strings to character arrays
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // Compare the sorted arrays
        return Arrays.equals(sArr, tArr);
        */

        /*
        --------------------------------
        Approach 2: Using Two HashMaps
        --------------------------------
        
        // Create two HashMaps to store character frequencies
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        // Count frequencies for both strings
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        // Compare both HashMaps
        return mapS.equals(mapT);
        */

        /*
        --------------------------------
        Approach 3: Using Single HashMap
        --------------------------------
        */

        // Create a single HashMap to store character frequencies from string s
        HashMap<Character, Integer> hmap = new HashMap<>();

        // Step 2: Count characters in string s and store in HashMap
        for (char c : s.toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }

        // Step 3: Decrease frequency for characters found in string t
        for (char c : t.toCharArray()) {
            // If character not found in map, it's not an anagram
            if (!hmap.containsKey(c)) {
                return false;
            }

            // Decrease the frequency of the character
            hmap.put(c, hmap.get(c) - 1);

            // If frequency becomes negative, t has more of that character than s
            if (hmap.get(c) < 0) {
                return false;
            }
        }

        // Step 4: All character frequencies matched, return true
        return true;
    }
}
