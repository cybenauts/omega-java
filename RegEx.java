import java.util.Scanner;
class RegEx
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER DATE");
		String str=sc.nextLine();

		if (str.matches("\\d{4}-\\d{2}-\\d{2}")) {
			System.out.println("ACCEPTED");
    
}
else
{
	System.out.println("BOOOO!!!");
	}
}
}