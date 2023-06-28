
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
public class passwordcheck {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username:");
        String name = sc.nextLine();
        System.out.println("enter the password:");
        String pw = sc.nextLine();
        int special=0;int upper = 0;
        int digit=0,lower=0,digit2=0;
        int sum=0;
        if(pw.length()< 8)
        {
            System.out.println("Invalid Password!");
        }
        else
        {
            for(int i=0;i<pw.length();i++)
        {
            char pass=pw.charAt(i);
            if(pass=='!'||pass=='@'||pass=='#'||pass=='$'||pass=='%'||pass=='^'||pass=='&'||pass=='*')
            {
                special=1;
            }
            else if(Character.isUpperCase(pass))
            {
                upper=1;
            }
            else if(Character.isLowerCase(pass))
            {
                 lower = 1;
            }
            else if(pass=='0'||pass=='1'||pass=='2'||pass=='3'||pass=='4'||pass=='5'||pass=='6'||pass=='7'||pass=='8'||pass=='9')
            {
                digit=1;
                int x=Character.getNumericValue(pass);
                if(pw.charAt(i+1)!=x+1)
                {
                    digit2=1;
                }
                else
                {
                    digit=1;
                }
            }
            
            
        }
            sum=upper+lower+digit+special+digit2;
            if(sum==5)
            {
                 System.out.println("Very Strong Password!");
            }
            else if(sum==4)
            {
                System.out.println("Strong Password!");
            }
            else if(sum==3)
            {
                 System.out.println("Medium Password!");
            }
            else
            {
                 System.out.println("Weak Password!");
            }
         
        }
       
}
}
