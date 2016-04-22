

import java.util.Scanner;
//import java.io.*;
 class LeadGame 
 {
     
     public static void main(String[]args)
             
     {
        int p1=0;
        int p2=0;
        int w=0;
        int sc=0; 
        int max=0;
        int win=0;
        Scanner s=new Scanner(System.in);
         
         int t=s.nextInt();
        // if(t<=10000)
{
         for(int i=0;i<t;i++)
         {
         p1=s.nextInt();
         p2=s.nextInt();
            
            if(p1>p2)
            {
             sc=p1-p2;   
             w=1;
            }
             else
             {
                sc=p2-p1;
                w=2;
             }

            if(max<sc)
            { 
                max=sc;
                win=w;

            }
             
        }
            }
     System.out.print(win+" "+max);
       

     }
 }