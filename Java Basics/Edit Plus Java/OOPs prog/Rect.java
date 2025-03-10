class Rect{
	int l;
	int b;
	int h;

	public void rectangle(){
		int area=l*b*h;
		System.out.println("Area of Rectangle= "+area);
		System.out.println();

	}

	public void rectangle2d(){
		int area2=l*b;
		System.out.println("Area of Rectangle= "+area2);
		System.out.println();
	}

	public void display(){
		System.out.println("length= "+this.l);
		System.out.println("breadth= "+this.b);
		System.out.println("height= "+this.h);
	}

}
