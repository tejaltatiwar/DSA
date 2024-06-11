// .Print the following pattern for the given number of rows.
// Note: N is always odd.
// N=5
//   *
//  ***
// *****
//  ***
//   *
import java.util.Scanner;
class Pat10{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        int x=n/2+1;
        for(int i=0;i<x;i++){
            for(int j=0;j<x-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=0;i<n-x;i++){
            for(int j=0;j<n-x+i-1;j++){
                System.out.print(" ");
            }
            
            for(int k=0;k<2-2*i+1;k++){
                System.out.print("*");
            }System.out.println();
        }
    }
}


//sir ka logic 
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int x = (n / 2) + 1;

//         // First part
//         for (int i = 0; i < x; i++) {
//             for (int j = 1; j <= x- i - 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < 2 * i + 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // Second part
//         for (int i = 1; i <= (n - x); i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= n - (2 * i); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }