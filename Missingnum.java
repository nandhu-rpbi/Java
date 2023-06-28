
import java.util.Arrays;
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
public class missingnum {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        int i,j,temp;
        int []arr=new int[n];
        int []a=new int[10];
        System.out.println("enter the array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
         System.out.println("the sorted array is:");
         for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            
        }
         int k=0;
         for(i=0;i<n;i++)
         {
             if(arr[i]!=k)
             {
                 System.out.println("the missing no is:");
                  System.out.println(k);
                  k++;
             }
             k++;
         }
       
     }
}
