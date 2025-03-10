class Ulogic {

	public static void main(String[] args){
		Rect ar1=new Rect();
		ar1.l=10;
		ar1.b=12;
		ar1.h=5;
		System.out.println("3d Area of Rectangle-1");
		ar1.display();
		ar1.rectangle();

		//obj2
		Rect ar2=new Rect();
		ar2.l=20;
		ar2.b=6;
		ar2.h=10;
		System.out.println("3d Area of Rectangle-2");
		ar2.display();
		ar2.rectangle();

		//obj3
		Rect ar3=new Rect();
		ar3.l=12;
		ar3.b=6;
		System.out.println("2d Area of Rectangle-3");
		ar3.display();
		ar3.rectangle2d();

		
	}
}
