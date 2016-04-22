class Random
{
	public static void main(String ... args)
	{
		int num=0,c=0;
        int m=1,z=1;
        int i,j;
        int arr[]=new int[100];
        
	        
            for(j=0;j<100;)
            {
			num=(int)(101*Math.random());
			c=0;
			for(i=0;i<m;i++)
			{
			if(arr[i]!=num)   
			{
				c++;
			}
			}

			if(c==m)
			{
				arr[j]=num;
				m++;
				j++;
			}
			}
		

		for(i=0;i<arr.length;i++)
		{
			//System.out.println(String.format("[%-10d" +"= %d" ,z++, arr[i] ));
			System.out.printf( "  | %-10d || %10d | %n", z++, arr[i]);
			System.out.println("________________________________");
		}
	}
}

