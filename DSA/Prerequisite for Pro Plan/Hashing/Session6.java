//Find count of number of subarrays with sum ==  k 

import java.util.HashMap;
import java.util.Scanner;

class Session6 {

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

        //bruteforce approach
        // int count=0;
        // for(int i =0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int sum=0;
        //         for(int l=i;l<=j;l++){
        //             sum+=arr[l];
        //         }if(sum==k){
        //             count++;
        //         }
        //     }
        // }System.out.println("Count "+count);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,1);//if suppose sum-k=0 then it should be add freq 1
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {

            hmap.put(sum += arr[i],hmap.getOrDefault(sum, 0)+1 );
            
            if (hmap.containsKey(sum - k)) {
                count+= hmap.get(sum - k);
            }
        }
        System.out.println(count);
    }

}

