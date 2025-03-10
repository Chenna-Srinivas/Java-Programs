class BikeUser{
	public static void main(String[] args){
		
		Bike b1=new Bike();
		b1.model="classic-350";
		b1.price=22000.0;
		b1.milage=25.5;
		System.out.println("Bike 1 details & behaviour");
		b1.ride();
		b1.display();
		//obj2
		Bike b2=new Bike();
		b2.model="GT-650";
		b2.price=42000.0;
		b2.milage=20.5;
		System.out.println("Bike 2 details & behaviour");
		b2.ride();
		b2.display();
	}
}
