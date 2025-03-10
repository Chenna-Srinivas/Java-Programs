class P2{
	public static void main(String[] args) {
		System.out.println("from P2 class begin");
		P1.add();
		System.out.println("from P2 class begin");
		P1 obj=new P1();
		obj.sub();

	}
}
