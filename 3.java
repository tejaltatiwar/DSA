// Maximum pair sum from two arrays

// 
import java.util.Scanner;
class maxSum{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elments of arr1:");
        int n1=sc.nextInt();
        System.out.println("Enter number of elments of arr2:");
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        System.out.println("Enter elments of arr1:");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        
        System.out.println("Enter elments of arr2:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
       
        int maxSum=0;
        for(int i=0;i<n1;i++){
            
            for(int j=0;j<n2;j++){
                 int sum=0;
                sum+=(arr1[i]+arr2[j]);
                
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }System.out.println("Maximum Sum of all pairs is : "+maxSum);
    }
}