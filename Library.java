
//package metric1;
import java .io.*;
class Library
{
	
	public static void main(String[]args)throws Exception
	{
		int nx=0;
	BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
	Book b[]=new Book[5];
	for(int i=0;i<5;i++)
	{
		b[i]=new Book();
	}
	do
	{
	System.out.println("Enter Operation: \n1: Input \n2: Display");

	int z=Integer.parseInt(br.readLine());
	switch(z)
	{
	case 1:
	{
    for(int i=0;i<5;i++)
    {   
    	System.out.println("Enter Records For Book:"+(i+1));

    	System.out.println("BookID:");
    	b[i].setBookID(Integer.parseInt(br.readLine()));
    	System.out.println("Name:");
    	b[i].setName(br.readLine());
    	System.out.println("Author:");
    	b[i].setAuthor(br.readLine());
    	System.out.println("Type:");
    	b[i].setType(br.readLine());
    	System.out.println("Availability:");
    	//b[i].setAvailability('Y');//Check These lines
    	b[i].setAvailability(br.readLine().charAt(0));// Not working Number Format Exception
    	

    }	
	}
	break;
	
	case 2:
	{
        System.out.println("Enter __ID__ Of The Book To Get The Details:");
        int bid=Integer.parseInt(br.readLine());

		for(int i=0;i<5;i++)
	    {
		if (b[i].getBookID()==bid)
		{
			bid=i;
		}
       
	    }   
			//System.out.println("Details of Book:"+(i+1));
			System.out.println("BookID:"+b[bid].getBookID());
			System.out.println("Name:"+b[bid].getName());
			System.out.println("Author:"+b[bid].getAuthor());
			System.out.println("Type:"+b[bid].getType());
			System.out.println("Availability:"+b[bid].getAvailability());
			
	    
	
	
	}

	break;
	default:
	{
		System.out.println("Invalid");
	}
	
	}
	System.out.println("1:Re-enter or Display: \n 0:Exit");
	 nx=Integer.parseInt(br.readLine());
}
    while(nx!=0);
	}
	}


class MyException extends Exception
{

	private static final long serialVersionUID = 1L;

	MyException(String msg)
	{
		super(msg);

	}
}


class Book extends Library
{
	
	private int bookID;
    private String name,author,type;
    private char availability;
    
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type)throws MyException {
		if(type.equalsIgnoreCase("Technical")||type.equalsIgnoreCase("Others"))
		{
			this.type = type;
		}
		else{
		throw new MyException("InvalidValueException");
	}
	}
	public char getAvailability() {
		return availability;
	}
	public void setAvailability(char availability)throws MyException {
		if(availability=='Y'||availability=='N')
		{
			this.availability = availability;
		}
		else
		{
			throw new MyException("InvalidValueException");
		
		}
	}

}