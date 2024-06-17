// Sum of pairs using two arrays
import java.util.Scanner;
class Sum{
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
        int sum=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                sum+=(arr1[i]+arr2[j]);
            }
        }System.out.println("Sum of all pairs is : "+sum);
    }
}