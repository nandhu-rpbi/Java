
import static com.sun.javafx.geom.Point2D.distance;
import static java.awt.geom.Point2D.distance;
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
public class graphtravelingsalesperson {
     public static void main(String[] args)
    {
         LinkedList<Integer> l=new LinkedList<>();
        Scanner sc =new Scanner (System.in);
        int i,j,cost = 0;
        System.out.println("enter the vertices:");
        int n=sc.nextInt();
        int [][]distance= new int[n][n];
        boolean []visit=new boolean[n];
        System.out.println("enter the distance:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                distance[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            visit[i]=false;
        }
        for(i=0;i<n;i++)
        {
            if(visit[i]!=true)
            {
                int min=999;
                for(j=0;j<n;j++)
                {
                    if(visit[j]!=true&&min>distance[i][j])
                    {
                        min=distance[i][j];
                    }
                }
                for(j=0;j<n;j++)
                {
                    if(distance[i][j]==min)
                    {
                        l.add(j);
                    }
                }
                cost+=min;
            }
        }
        System.out.println(l);
        System.out.println(cost);
        
}
}
