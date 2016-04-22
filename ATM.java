import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;
class ATM
{
	public static void main(String []args) throws IOException
	{ 
		double amnt=0;
		double bal=0;

		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner s=new Scanner(System.in);

		amnt=s.nextDouble();
		bal=s.nextDouble();
		//System.out.println("Amount:"+amnt+"Balance:"+bal);

		if( 0<amnt && amnt<= 2000 && 0<= bal && bal<= 2000)
		{

		if(amnt%5==0 && bal>=amnt+0.50)
		{
			System.out.println(new DecimalFormat("#0.00").format(bal-(amnt+0.50)));
		}
		else
			System.out.println(new DecimalFormat("#0.00").format(bal));


		}
        else
        	System.exit(0);
    
       

	}
}