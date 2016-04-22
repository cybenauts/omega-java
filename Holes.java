import java.io.*;
class Holes
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        int m=0;
		int t=Integer.parseInt(br.readLine());
		int arr[]=new int[t];
		if(t<=40)
		{
		for(int j=0;j<t;j++)
		{
		String in=br.readLine();
        count=0;
		for(int i=0;i<in.length();i++)
		{
			if(in.charAt(i)=='A'||in.charAt(i)=='D'||in.charAt(i)=='O'||in.charAt(i)=='P'||in.charAt(i)=='Q'||in.charAt(i)=='R')
				count++;
			else if(in.charAt(i)=='B')
			count+=2;
		}
		arr[m++]=count;
}

        for(int z=0;z<m;z++)
        System.out.println(arr[z]);
}
}
}