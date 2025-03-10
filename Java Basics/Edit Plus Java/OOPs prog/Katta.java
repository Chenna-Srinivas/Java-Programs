class Katta{
	String gname;
	double price;
	int bullet;
	
	public Katta(String gname,double price,int bullet){
		this.gname=gname;
		this.price=price;
		this.bullet=bullet;
		
	}

	public void shoot(){
		System.out.println("kill..and...loooot ><");
	}
	
	public void display(){
		System.out.println(this.gname);
		System.out.println("Rs "+this.price);
		System.out.println(this.bullet);
	}
}
