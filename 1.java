// Sum of pairs using single array

import java.util.Scanner;
class SumOfPairs{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elments:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elments:");
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum+=(arr[i]+arr[j]);
            }
        }System.out.println("Sum of all pairs is : "+sum);

    }
}