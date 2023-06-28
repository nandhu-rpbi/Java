
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
public class numberprint {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        int j=1;
        for(int i=0;i<n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
             for( ;j>0;j--)
                {
                    System.out.print(j);
                }
            System.out.println("");
        }
     }
}
