// Find Sum of Range  [l……….r] where(l<=r) using Prefix sum. 
import java.util.HashMap;
import java.util.Scanner;
class Session5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//bruteforce approach
        // Using Prefix Sum to find sum of range [l, r]
        int l= sc.nextInt();
        int r= sc.nextInt();
        int lSum=0;
        // int sum=0;
        // for(int i =0;i<=r;i++){
        //     sum+=arr[i];
        //     if(i+1==l){
        //         lSum=sum;
        //     }

        // }System.out.println("Sum of range "+ (sum-lSum));

        // Optimized approach using Prefix Sum
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int sum=0;
        for(int i=0;i<=r;i++){
            sum+=arr[i];
            hmap.put(i,sum);
            if(i+1==l){
                lSum=sum;
            }

        }System.out.println("Sum of range "+ (sum-lSum));
    }
}
