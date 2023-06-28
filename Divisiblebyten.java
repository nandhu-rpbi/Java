
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
public class linkedlist {
/* Name of the class has to be "Main" only if the class is public. */

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []test=new int[n];
		int res;
		for(int i=0;i<n;i++)
		{
		    int x=sc.nextInt();
		    if(x<10)
		    {
		        res=0;
		    }
		    else{
		        if(x%10==0)
		        {
		          res=1;  
		        }
		        else{
		            res=-1;
		        }
		    }
		    System.out.println(res);
		}
	}
}

