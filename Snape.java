import java.util.Scanner;
//import java.text.DecimalFormat;
 class Snape
 {
 	public static void main(String []args)
 	{
 	
 		Scanner s=new Scanner(System.in);
 		int t=s.nextInt();

 		int bs[]=new int[t];
 		int ls[]=new int[t];
 		float rsl[]=new float[t];
 		float rsh[]=new float[t];

 		if(t>=1 && t<=1000)
 		for(int i=0;i<t;i++)
 		{
 			bs[i]=s.nextInt();
 		    ls[i]=s.nextInt();
 			
 		}
 		for(int i=0;i<t;i++)
 		{
 			
 			rsl[i]=(float)Math.sqrt(Math.pow(ls[i],2)-Math.pow(bs[i],2));
 			rsh[i]=(float)Math.sqrt(Math.pow(ls[i],2)+Math.pow(bs[i],2));
 			System.out.print(rsl[i]+" "+rsh[i]);
 			System.out.println();
 		}


 	}
 }