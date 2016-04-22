import java .util.Scanner;
class Scn
{
	public static void main(String []args)
	{
		Scanner st=new Scanner(System.in).useDelimiter("\\s*\n\\s*");
		
		System.out.println("Enter The Person's Roll No.:");
        int i=st.nextInt();
        
        System.out.println("Enter The Person's Marks:");
        Double d=st.nextDouble();
        
        System.out.println("Enter The Person's Name:");
		String s=st.next();

System.out.println("Roll No"+i+"\nMarks:"+d+"\n Name:"+s);
}

}
