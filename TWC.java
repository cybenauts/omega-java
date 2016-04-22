import java.util.Scanner;
class TWC
{
	int a[]=new int[2];
	int b[]=new int[2];
	int c[]=new int[2];

	int t,r;
    public void input()
    {
    Scanner s=new Scanner(System.in);
    t=s.nextInt();
    if(t<=100)
    for(int j=0;j<t;j++)	
    {
    r=s.nextInt();
    
    for(int i=0;i<2;i++)
    	a[i]=s.nextInt();
    
    for(int i=0;i<2;i++)
    	b[i]=s.nextInt();
    
    for(int i=0;i<2;i++)
    	c[i]=s.nextInt();

        calc();
    }
    }
    public void calc()
    {
    int d[]=new int[3];
    
    	d[0]=dist(a,b);
    
    	d[1]=dist(b,c);
  
    	d[2]=dist(a,c);

    	if((d[0]<=r&& d[1]<=r)||(d[1]<=r&& d[2]<=r)||(d[0]<=r&& d[2]<=r))
    	{
    		System.out.println("yes");
    	}
    	else
    		System.out.println("no");
    }

    public int dist(int t1[],int t2[])
    {
    	return (int)Math.ceil(Math.sqrt(Math.pow((t1[0]-t2[0]),2)+Math.pow((t1[1]-t2[1]),2)));
    }
	public static void main(String[] args) 
	{
		TWC ob=new TWC();
		ob.input();
		
	}
}