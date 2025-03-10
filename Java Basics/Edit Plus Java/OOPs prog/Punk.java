class Punk{
	public static void main(String[] args){
		
		Katta g1=new Katta("Ak-47",240000,32);
	
		System.out.println("Gun 1 details & behaviour");
		g1.shoot();
		g1.display();
		//obj2
		Katta g2=new Katta("Desert Eagle",86000,07);
		
		System.out.println("Gun 2 details & behaviour");
		g2.shoot();
		g2.display();
	}
}
