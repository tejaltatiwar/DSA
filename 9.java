// Print the following pattern for the given number of rows.
// n=5
// Sample Output 1:
//     1
//    232
//   34543
//  4567654
// 567898765


import java.util.Scanner;
class Pat9{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }int l=i+1;
            for(int j=0;j<i+1;j++){   
                 System.out.print(l++);
            }
            int m=2*i;
            for(int k=0;k<i;k++){
                System.out.print(m--);
            }System.out.println();
        }                   
    }
}