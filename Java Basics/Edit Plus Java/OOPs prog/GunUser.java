class GunUser{
	public static void main(String[] args){
		
		Gun g1=new Gun();
		g1.brand="Ak-47";
		g1.model="AR";
		g1.magzine=32;
		g1.price=240005.5;
		System.out.println("Gun 1 details & behaviour");
		g1.shoot();
		g1.display();
		//obj2
		Gun g2=new Gun();
		g2.brand="Ak-57";
		g2.model="SAR";
		g2.magzine=42;
		g2.price=220000.5;
		System.out.println("Gun 2 details & behaviour");
		g2.shoot();
		g2.display();
	}
}
