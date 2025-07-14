
import java.util.HashMap;
import java.util.Scanner;

// Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j] 
class Session3 {

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
        //         if(arr[i]+arr[j]==k){
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
            int complement=k-arr[i];
            if(hashmap.containsKey(complement)){
                count+= hashmap.get(complement);
            }
        }System.out.println(count);

   
    }   
}
