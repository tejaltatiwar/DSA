







//wrong
import java.util.Scanner;
class Pat15{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter N: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(i==0|j==0|j==n-i-1){
                    System.out.print("*");
                }
            }System.out.println();
        }
        
    }
}