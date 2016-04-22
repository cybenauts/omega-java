import java.util.Scanner;
import java.util.InputMismatchException;

class Num
{
	int a,b;
	Num()
	{
		this.a=0;
		this.b=0;
	}

	 void check()
	 {
	 	Scanner s=new Scanner(System.in);
	 	System.out.println("Enter a & b");
	 	a=s.nextInt();
	 	b=s.nextInt();

	 	int r=a/b;
	 	System.out.println("Result:"+r);
	 }
}

public class TryCheck
{
	public static void main(String ... args)
	{
	      try{
	      	  System.out.println("Try Start");
		      Num n=new Num();
		      //break;
		      //System.exit(0);
		      n.check();
		      
		      System.out.println("Try End");
	         }
         catch(ArithmeticException e)
         {
         	System.out.println("ArithmeticException Generated");
         }
         catch(InputMismatchException i)
         {
         	System.out.println("InputMismatchException Generated");
         }
         finally
         {
         	System.out.println("Finally Executed");
         }

	}
}