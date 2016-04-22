class Matrixmul
{
	public static void main(String []args)
	{
		int s=0;
		int i,j,k;          
		int[][] a= {{1,1,1},{2,2,2},{3,3,3}};
		int[][] b= {{4,4,4},{5,5,5},{6,6,6}};
		int[][] c =new int [3][3];

		for(i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					s=s+a[i][k]*b[k][j];
				}
			c[i][j]=s;
			s=0;
		}
	}

		System.out.println("Multplied:"); 
		for(i=0;i<a.length;i++)
		{
			for ( j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");

			}
			System.out.println();
		}



	}
}