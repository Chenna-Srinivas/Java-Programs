class UserStudent{
	public static void main(String[] args) {
		StudentDetails s1=new StudentDetails("Ram",22,"ram@gmail.com",8642213412l);
		
		System.out.println("Student-1 details");
		s1.display();
		s1.study();

		//obj2
		StudentDetails s2=new StudentDetails("Laxman",20,"laxman@gmail.com",8642213412l);
		
		System.out.println("Student-2 details");
		s2.display();
		s2.study();

		//obj3
		StudentDetails s3=new StudentDetails("Bharat",21,"bharat@gmail.com",8642213412l);
		
		System.out.println("Student-3 details");
		s3.display();
		s3.study();
	}
	
}
