 //We are given an Array of Numbers. We have to find and print any Number with Maximum Frequency and Minimum Frequency.

// Example Testcase:-

// Arr = [3, 2, 3, 2, 4, 3]

// Frequencies of Elements of Array are:-

// 3 - 3
// 2 - 2
// 4 - 1

// Maximum Frequency:- Element is 3, Frequency is 3
// Minimum Frequency:- Element is 4, Frequency is 1

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Session1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

//bruteforce approach
//Time Complexity: O(n^2)
//Space Complexity: O(1)
// We are using two loops to count the frequency of each element in the array.
// We keep track of the maximum and minimum frequencies and their corresponding elements.   
        // int maxFreq=0;
        // int maxEle= arr[0];
        // int minFreq=0;
        // int minEle= arr[0];

        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count>maxFreq){
        //         maxFreq=count;
        //         maxEle=arr[i];
        //     }
        //     if(count<minFreq || minFreq==0){
        //         minFreq=count;
        //         minEle=arr[i];
        //     }
        // }

        //optimized approach
//Time Complexity: O(n)
//Space Complexity: O(n)
// We can use a HashMap to store the frequency of each element in the array.
        // Then we can iterate through the HashMap to find the maximum and minimum frequencies.

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0;i<n;i++){
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
Map<Integer, Integer> mp = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE, maxEle = arr[0];
        int minFreq = Integer.MAX_VALUE, minEle= arr[0];
 
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
 
        for (Map.Entry<Integer, Integer> num : mp.entrySet()){
            if (num.getValue() >= maxFreq){
                maxFreq = num.getValue();
                maxEle = num.getKey();
            }
            if (num.getValue() <= minFreq){
                minFreq = num.getValue();
                minEle = num.getKey();
            }
        }
        System.out.println("Maximum Frequency:- Element is " + maxEle + ", Frequency is " + maxFreq);
        System.out.println("Minimum Frequency:- Element is " + minEle + ", Frequency is " + minFreq);
    }
} 