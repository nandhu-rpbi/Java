
import java.util.Iterator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 1
 */
public class LLpaliandrome {
    public static void main(String[] args)
    {
        int flag=0;
        LinkedList <Integer> l=new LinkedList<>();
        l.add(3);
        l.add(4);
        l.add(3);
        Iterator<Integer> it=l.iterator();
        Iterator<Integer> rev=l.descendingIterator();
        while(it.hasNext()&&rev.hasNext())
        {
            if(!it.next().equals(rev.next()))
            {
                flag=0;
                break; 
            }
            else{
                    flag=1;
                    }
                             
        }
        if(flag==1)
        {
            System.out.println(" paliandom:");
        }
        else{
            System.out.println("not paliandom:");
        }
    }
}
