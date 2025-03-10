class Method3 
{
	public static void Add() 
	{
		System.out.println("Add Begin...");
	Test();
		System.out.println("Add End......");
	}

	public static void main (String [] args) {
	System.out.println("Main Begin.....");
	Add();
	Test();
	System.out.println("Main Ends......");
	}

	public static void Test() {
	System.out.println("Test Begin..");
	System.out.println("Test Ends....");
	}

}
