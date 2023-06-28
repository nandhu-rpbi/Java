
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
public class reverseword {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        int i,j;
        System.out.println("enter the string for word reverse:");
        String[] str = sc.nextLine().split(" ");
        for(i= str.length-1;i>=0;i--)
        {
            System.out.print(str[i]+" ");
        }
       
}
}
