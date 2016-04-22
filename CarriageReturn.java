class CarriageReturn
{
public static void main(String[] args) throws Exception
 {
		System.out.println("Syed \r Moonis \n Haider \f Abdi");
		//Carriage Return will only move the cursor back to the beginning of the current line
		for(int i=0;i<=10;i++)
		{
			System.out.print(i+"\r");
			Thread.sleep(250);
			
			
		}

	}	
}