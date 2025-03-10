class StudentDetails{
	String name;
	int age;
	String email;
	long mobile;

	public StudentDetails(String name,int age,String email,long mobile){
		this.name=name;
		this.age=age;
		this.email=email;
		this.mobile=mobile;
	}

	public void study(){
		System.out.println("Seat and study properly");
		System.out.println();
	}

	public void display(){
			System.out.println("Name: "+this.name);
			System.out.println("Age: "+this.age);
			System.out.println("Email ID: "+this.email);
			System.out.println("Mobile No.: "+this.mobile);
			
	}
}
