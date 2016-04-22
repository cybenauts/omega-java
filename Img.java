import java.io.*;
import java.util.*;
class Img
{
	public static void main(String ... args)
	{
		
		 
		try
		{
			//FileWriter fw=new FileWriter("MY.JPG");// Character Oriented Codes
			 			
			//FileReader fr=new FileReader("IMG_2844.JPG");
			FileInputStream fin=new FileInputStream("IMG_2844.JPG");// Use Byte Oriented Codes
			FileOutputStream fout=new FileOutputStream("IMGNew.jpg");
			

           int k;

        while ((k= fin.read()) > -1)
         {
         	
            fout.write(k);

			
             }
             fout.close();
             fin.close();
         }

             
       

            catch(Exception e)
            {
            	System.out.println("Matrix"+e);
            }
		}
	}