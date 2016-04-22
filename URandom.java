import java.util.Random;
	class URandom
	{
		public static void main(String[] args)
		 {
		 	int n=0;
		 	int a[]=new int[100];
			 Random r= new Random(5);
			for(int j=0;j<100;j++)
			 {
			 n=r.nextInt();
			 System.out.println(r);
			}

		}
}