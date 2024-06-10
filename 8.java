//  Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 333
// 22
// 1

import java.util.Scanner;
class Pat8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter N: ");
        int n=sc.nextInt();
        int l=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(l);
            }
            l--;
            System.out.println();
        }

    }
}