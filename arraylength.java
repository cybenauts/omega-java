class Arraylength
{
	public static void main (String ... args)
	{
		int [][]num= new int[3][8];

		for(int i=0;i<num.length;i++)
		{
			for (int j=0;j<num[0].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Rows:"+num.length+"Columns:"+num[0].length);

	}
}