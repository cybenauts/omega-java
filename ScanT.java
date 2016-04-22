import java.util.Scanner;
import java.io.*;
public class ScanT
{
public static void main(String[] args) {

	//1st Way Using File
		/*Scanner sc=null;
		try{
			sc=new Scanner(new File("feedfile.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FileNotFound"+e);
		}*/

		//2nd Way Using Input Stream
		Scanner sc = new Scanner(System.in);

		//3rd Way Using Strinb
		/*String s="123_456_667_999_111";
		Scanner sc = new Scanner(s);*/
		sc.useDelimiter("_");
        
         while(sc.hasNext())
         {
         	int i=sc.nextInt();
			System.out.println("Num:"+i);

         }
			}	
}