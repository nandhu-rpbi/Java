
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
public class coinchange {
    public static void main(String[] args)
    {
        LinkedList<Integer> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int[] coin={2000,500,100,50,20,10,5,2,1};
        System.out.println("enter the amount:");
        int amt=sc.nextInt();
        int count=0;
        for(int i=0;i<9;i++)
        {
            int x=amt/coin[i];
            count=count+x;
            if(x!=0)
            {
                l.add(coin[i]);
            }
             amt=amt%coin[i];
            
        }
         System.out.println("the no of minimum coins needed:"+count);
          System.out.println("the coins are:"+l);
        
                
    }
            
}
