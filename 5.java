// Triplet sum in array/************Revise*************************************/


import java.util.Scanner;
class tripSumEOCount{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elments:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elments:");
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
        }
       int evenSum=0;
       int oddSum=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
              for(int k=j+1;k<arr.length;k++){
                  int sum=arr[i]+arr[j]+arr[k];
                  
                  if(sum%2==0){
                     evenSum++;   
                  }                                  
                  else { 
                    oddSum++;
                  }                  
                }
            }
        }System.out.println("Even & Odd triplet sum count is "+evenSum+" "+oddSum+"respectively");
      }
        
    }
