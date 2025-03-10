class Gun {
	String brand;
	String model;
	int magzine;
	double price;

	public void shoot(){
		System.out.println("shoot......to kill.....");
	}
	
	public void display(){
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println("Rs "+this.price);
		System.out.println(this.magzine);
	}
}
