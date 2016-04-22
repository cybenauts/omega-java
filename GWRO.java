class GWRO
{
	int findMax(int x,int y)
	{
		int z=x-y;
		int i=(z>>31) & 0x1;
		int max=x-i*z;
		return max;
	}
	public static void main(String[] args) {
	GWRO g=new GWRO();
	System.out.println(":Greatest Number Is:"+g.findMax(7,2));	
	}
}