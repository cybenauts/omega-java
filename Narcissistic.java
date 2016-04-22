public class Narcissistic
{	
	int r,rev,c=0;
	int gt=100;
	int arm;
	int i;
  	void fx()
  	{
	while(c<10)
	{
		gt++;
	    arm=gt;
	    rev=0;
	    if(gt/1000==0)
	    {
	    	i=3;
	    }
	    else if(gt/10000==0)
	    {
	    	i=4;
	    }
	    else
	    {
	    	i=5;
	    }
	while(arm!=0)
	{
		r=arm%10;
		rev+=Math.pow(r,i);
		arm=arm/10;
	}
		if(gt==rev)
		{
			System.out.println(gt);
			c++;
		}

	}
}
		public static void main(String[] args) {
			Bank b=new Bank();
			b.fx();
		}
}