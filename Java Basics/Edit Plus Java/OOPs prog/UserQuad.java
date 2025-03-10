class UserQuad {

	public static void main(String[] args){
		Quad ar1=new Quad(10,12,5);
	
		System.out.println("3d Area of Rectangle-1");
		ar1.display();
		ar1.area3d();

		//obj2
		Quad ar2=new Quad(20,6,10);
		
		System.out.println("3d Area of Rectangle-2");
		ar2.display();
		ar2.area3d();

		//obj3
		Quad ar3=new Quad(12,6);
		
		System.out.println("2d Area of Rectangle-3");
		ar3.display();
		ar3.area2d();

		
	}
}
