import java.io.*;
class Inrmthd
{
	
	public int input(int i,int j)
	{
		int z=i-j;
		int c=(z>>>31&0x01);
		return i -c*(z);
		
         
         
		
	}
	public static void main(String []ar)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:" );
		int i=Integer.parseInt(br.readLine());
        int j=Integer.parseInt(br.readLine());
		Inrmthd ob=new Inrmthd();
		System.out.println("Greater No. Is:  "+ob.input(i,j));
	}
}