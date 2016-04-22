class ThrdRnnble implements Runnable
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("Matrix");\
			try
			{
				thread.sleep(500);
			}
             catch(Exception e)
             {

               }	

		}
	}
}
Class Execute
{
	public static void public static void main(String[] args) {
		ThrdRnnble tr= new ThrdRnnble();
		thread t=new thread(tr);
		t.start()l
		String name="Moonis";
		for (int i=0;i<5;i++ ) {
			System.out.println(name);

				try{
					thread.sleep(500);

				}
			catch(Exception e)
			{}
			
		}
	}


}