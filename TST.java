import java.util.Scanner;
 
 class holes {
 
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		String text[]=new String[40];
		for(int i=0;i<t;i++)
		{
			text[i]=sc.next();
			
		}
		for(int i=0;i<t;i++)
		{    int count=0;char []ch;
			ch=text[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{     
				if(ch[j]=='A'||ch[j]=='D'||ch[j]=='O'||ch[j]=='P'||ch[j]=='Q'||ch[j]=='R')
				{count=count+1;
					
				}
				else if (ch[j]=='B')
				{
					count=count+2;
				}
				else
				count=count+0;
			}
			System.out.println(count);
		}
		
	}
	
}
 