
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 1
 */
public class Star {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int m=n-1;m>0;m--)
        {
            for(int k=m;k>0;k--)
            {
                 System.out.print("*");
            }
             System.out.println("");
        }
    }
}
