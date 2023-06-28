
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
public class muliplynum {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        int i,j,mul=1;
        int []arr=new int[n];
        System.out.println("enter the array elements:");
        for(i=0;i<n;i++)
        {
           arr[i]= sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            mul=mul*arr[i];
        }
    
         System.out.println(mul);
          System.out.println("two mul");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                System.out.println(arr[i]*arr[j]);
            }
        }
        
       
     }
}
