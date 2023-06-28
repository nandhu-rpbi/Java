
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
public class longestsubstring {
     public static void main(String[] args)
    {
         LinkedList<String> l=new LinkedList<>();
        Scanner sc =new Scanner (System.in);
        int i,j,m,n;
         System.out.println("enter the string:");
        String str= sc.nextLine();
        
        for(i=0;i<str.length();i++)
        {
            for(j=i+1;j<str.length()+1;j++)
            {
                String pal="";
                int flag=0;
                pal=str.substring(i,j);
                for(m=0;m<pal.length();m++)
                {
                    for(n=m+1;n<pal.length();n++)
                    {
                        
                        if(pal.charAt(m)==pal.charAt(n))
                        {
                          flag++;
                        }
                    }
                }
               
                if(flag==0)
                {
                    l.add(pal);
                }
                
            }
        }
        System.out.println(l);
        int max=-999;
        for(int x=0;x<l.size();x++)
        {
            String s="";
            s =l.get(x);
            int len=s.length(); 
            if(len>max)
            {
                max=len;
            }
        }
        for(int y=0;y<l.size();y++)
        {
            String s=l.get(y);
            if(s.length()==max)
            {
                System.out.println(s +" "+"the length is:"+max);
            }
        }
        
        
        }
}
