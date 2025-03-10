class UserS{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Ram";
		s1.age=22;
		s1.email="ram@gmail.com";
		s1.mobile=8642213412l;
		System.out.println("Student-1 details");
		s1.display();
		s1.study();

		//obj2
		Student s2=new Student();
		s2.name="Laxman";
		s2.age=22;
		s2.email="ram@gmail.com";
		s2.mobile=8642213412l;
		System.out.println("Student-2 details");
		s2.display();
		s2.study();

		//obj3
		Student s3=new Student();
		s3.name="Bharat";
		s3.age=22;
		s3.email="ram@gmail.com";
		s3.mobile=8642213412l;
		System.out.println("Student-3 details");
		s3.display();
		s3.study();
	}
	
}
