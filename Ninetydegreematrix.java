
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
public class ninetydegree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        System.out.println("enter the m value:");
        int m = sc.nextInt();
        int [][]arr= new int[n][m];
        int i,j;
         System.out.println("enter the array of matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is:");
         for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]);
                System.out.print("");
            }
            System.out.println("the output:");
        }
         System.out.println();
         for(i=0;i<m;i++)
         {
             for(j=n-1;j>=0;j--)
             {
                 System.out.print(arr[j][i]);
                  System.out.print("");
             }
              System.out.println();
         }
         
}
}
