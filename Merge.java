import java.io.*;
import java.util.*;
class Merge
{
	public static void main(String ... args)
	{
		 int n,k;
		 //Files Creation
		try
		{
			FileWriter fw;
			FileReader fr;
			
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			System.out.println("How many files you require?:");
			n=Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++)
			{
			System.out.println("Enter Content in File "+i);
			fw=new FileWriter(i+"File.txt");
			fw.write(br.readLine());
			fw.close();
             }

             fw=new FileWriter("FinalFile.txt");// Merge Process
             for(int i=0;i<n;i++)
			{
			 fr=new FileReader(i+"File.txt");
			 while((k=fr.read())!=-1)
			 {
			 	fw.write((char)k);
             }
             fw.write(32);  //ASCII for Space
             }
             fw.close();
          
             fr=new FileReader("FinalFile.txt");
             System.out.println("Final File:::");
             while((k=fr.read())!=-1)
			 {
			 	System.out.print((char)k);

			 }

        }

            catch(Exception e)
            {
            	System.out.println("Matrix"+e);
            }
		}
	}