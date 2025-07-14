// Check if there are any two Equal numbers in an array at a distance less than or equal to k

import java.util.Scanner;
import java.util.HashMap;

class Session2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //bruteforce approach
        //Time Complexity: O(n^2)   
        //Space Complexity: O(1)
        // We are using two loops to check if there are any two equal numbers in the array at a distance less than or equal to k.
        // We keep track of the indices of the elements and check if they are equal and within the distance k.
        // If we find such a pair, we print "Exist" and return.
        // If we finish the loops without finding such a pair, we print "Not Exist".
        // for(int i = 0; i < n; i++) {
        //     for(int j = i + 1; j < n; j++) {
        //         if(arr[i] == arr[j] && j - i <= k) {
        //             System.out.println("Exist");
        //             return; // Exit the method as we've found a valid pair
        //         }
        //     }
        // }

        // System.out.println("Not Exist");
        // Optimized approach using HashMap
        // Time Complexity: O(n)
        // Space Complexity: O(n)       
        // We can use a HashMap to store the last index of each element.
        // As we iterate through the array, we check if the current element exists in the HashMap and if the distance from its last occurrence is less than or equal to k.
        // If we find such a pair, we print "Exist" and return. 
        // If we finish the loop without finding such a pair, we print "Not Exist". 
        // This approach is more efficient than the brute force method as it reduces the time complexity to O(n) by using a HashMap to store the last seen indices of elements.
        // If an element is found in the HashMap and the distance from its last occurrence is less than or equal to k, we print "Exist".
        // Otherwise, we update the HashMap with the current index of the element.
        // If we finish the loop without finding such a pair, we print "Not Exist".
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashmap.containsKey(arr[i]) && i - hashmap.get(arr[i]) <= k) {
                System.out.println("Exist");
                return; // Exit the method as we've found a valid pair
            }
            hashmap.put(arr[i], i);
        }
        System.out.println("Not Exist");
    }
}
