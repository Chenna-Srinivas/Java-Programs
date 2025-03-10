class Quad{
	int length;
	int breadth;
	int height;

	public Quad(int l,int b,int h){
		this.length=l;
		this.breadth=b;
		this.height=h;
	}

	public Quad(int l,int b){
		this.length=l;
		this.breadth=b;
	}

	public void area3d(){
		int area=length*breadth*height;
		System.out.println("Area of Rectangle= "+area);
		System.out.println();

	}

	public void area2d(){
		int area2=length*breadth;
		System.out.println("Area of Rectangle= "+area2);
		System.out.println();
	}

	public void display(){
		System.out.println("length= "+this.length);
		System.out.println("breadth= "+this.breadth);
		System.out.println("height= "+this.height);
	}

}
