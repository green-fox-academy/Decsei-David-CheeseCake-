package Excersises;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter number :");
        int n=scan.nextInt();

        System.out.print("Enter Symbol :");
        char c = scan.next().charAt(0);

        for(int i=n;i>0 ;i--) {

            for(int j=0;j<n-i;j++) {
                System.out.print(" ");}

            for(int j=0;j<(i*2)-1;j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
