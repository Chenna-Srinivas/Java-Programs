class  Operations
{
	public static void main(String[] args) 
	{
	Addition();
	}

	public static void Addition() {
	int a=6,b=8,add;
	add=a+b;
	System.out.println("Sum of Given Numbers is : " + add);
	Subtraction();
	}


	public static void Subtraction() {
	int a=6,b=8,sub;
	sub=a-b;
	System.out.println("Subtraction of Given Numbers is : " + sub);
	Multiplication();
	}
	
	public static void Multiplication() {
	int a=6,b=8,mul;
	mul=a*b;
	System.out.println("Multiplication of Given Numbers is : " + mul);
	Division();
	}

	public static void Division() {
	int a=6,b=8,div;
	div=a/b;
	System.out.println("Division of Given Numbers is : " + div);
	Modulus();
	}

	public static void Modulus() {
	int a=6,b=8,mod;
	mod=a%b;
	System.out.println("Modulus of Given Numbers is : " + mod);
	}


}
