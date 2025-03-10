class Method4 
{

	public static void Add() 
	{
		System.out.println("Add Begin");
		System.out.println("Add End");
	Sub();
	}

	public static void Sub() 
	{
		System.out.println("Sub Begin");
		System.out.println("Sub End");

	}

	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		Add();
		System.out.println("Main Ends");
		Sub();
	}
	}

