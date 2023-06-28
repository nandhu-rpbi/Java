
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
public class substringpaliandrome {
      public static void main(String[] args)
    {
         LinkedList<String> l=new LinkedList<>();
        Scanner sc =new Scanner (System.in);
        int i,j;
         System.out.println("enter the string:");
        String str= sc.nextLine();
        
        for(i=0;i<str.length();i++)
        {
            for(j=i+1;j<str.length();j++)
            {
                String pal="";
                String rev="";
                pal=str.substring(i,j);
                System.out.println(pal);
                for(int m=pal.length()-1;m>=0;m--)
                {
                    rev+=pal.charAt(m);
                }
                if(pal.equals(rev))
                {
                    if(pal.length()!=1)
                    {
                        l.add(pal);
                    }
                    
                }
            }
        }
         
         if(l.size()==0)
         {
             System.out.println("paliandrom is not present in this string");
         }
         else
         {
            System.out.println(l);
         }
}
}
