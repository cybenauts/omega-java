class Thread1 implements Runnable
{	
	public void run(){
		try{
			for(int i=0;i<10;i++){
				Thread.sleep(500);
				System.out.println("Execution:"+Thread.currentThread().getName());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
public class MultiThread
{
	public static void main(String[] args) {
		Runnable r1 = new Thread1();
		Thread t1 = new Thread(r1);
		t1.setName("Alpha");
		t1.start();

		Runnable r2 = new Thread1();
		Thread t2 = new Thread(r2);
		t2.setName("Beta");
		t2.start();

	}
}