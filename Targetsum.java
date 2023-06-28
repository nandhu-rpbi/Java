
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
public class targetsum {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        int i,j,sum=0,flag=0;
        int a = 0,b = 0;
        int []arr=new int[n];
        System.out.println("enter the array elements:");
        for(i=0;i<n;i++)
        {
           arr[i]= sc.nextInt();
        }
         System.out.println("enter the target value:");
         int tar=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
               sum= arr[i]+arr[j];
                if(sum==tar)
               {
                    flag=1;
                    break;
               }
               else
               {
                   flag=0;
               }
        
             }
           
        }
        if(flag==1)
        {
            System.out.println("Target is achieved");
             
        }
        else
        {
             System.out.println("Target is not achieved");
        }
        
     }
}
