class Bike {
	static String brand="Bajaj";
	String model;
	double price;
	double milage;

	public void ride(){
		System.out.println("Enjoy your jolly ride machaaa..........baigan?");
	}
	
	public void display(){
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println("Rs "+this.price);
		System.out.println(this.milage+" kmpl");
	}
}
