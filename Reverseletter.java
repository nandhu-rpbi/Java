
import java.util.LinkedList;
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
public class reverseletter {
     public static void main(String[] args)
    {
         LinkedList<String> l=new LinkedList<>();
        Scanner sc =new Scanner (System.in);
        int i,j;
         System.out.println("enter the string for letter reverse:");
        String s = sc.nextLine();
        String rev="";
        String str="";
        for(i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                 rev+=s.charAt(i);
            }
           
        }
        j=0;
        int m=0;
        for( int k=0;k<s.length();k++)
        {
            if(s.charAt(k)!=' ')
            {
                 l.add(String.valueOf(rev.charAt(j)));
                 j++;
            }
            else
            {
               l.add(" ");
            }
               
        }
        for(m=0;m<l.size();m++)
        {
            System.out.print(l.get(m));
        }
    }
}
