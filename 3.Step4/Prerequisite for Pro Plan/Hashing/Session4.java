//Count all i,j pairs where i<j and abs(b[i]-b[j]) = k [k>=0] 

import java.util.HashMap;
import java.util.Scanner;
class Session4 {

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
        // int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]-arr[j]==k || arr[j]-arr[i]==k){
        //             count++;
        //         }
        //     }
        // }System.out.println(count);

        // Optimized approach using HashMap
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        // Note: This approach counts pairs (i, j) and (j, i) as separate pairs.
        // If you want to count each pair only once, you can modify the logic accordingly.
        // Using HashMap to store frequency of elements
        // and count pairs
        // where b[i] + b[j] == k
        // This will count pairs (i, j) and (j, i) separately.
        HashMap<Integer,Integer>  hashmap= new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            hashmap.put(arr[i],hashmap.getOrDefault(arr[i], 0)+1);
            int complement1=k+arr[i];
            int complement2=arr[i]-k;
            if(hashmap.containsKey(complement1)){
                count+= hashmap.get(complement1);
            }
            if(hashmap.containsKey(complement2)){
                count+= hashmap.get(complement2);
            }
        }System.out.println(count);

   
    }   
}
