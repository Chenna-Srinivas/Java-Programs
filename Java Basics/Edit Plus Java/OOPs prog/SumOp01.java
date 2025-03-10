class SumOp01 {
	public static void main(String[] args) {
		int n=14466281,temp=n;
		int sum=0,sum1=0;
		int count=0;
		while (n>0){
			int rem=n%10;
			count++;
			if (count==1||n<=9){
				sum=sum+rem;
				//System.out.println(sum);
			}
			else{
				sum1=sum1+rem;
				//System.out.println(sum1);
			}
			n=n/10;
		}
		System.out.println("sumex "+sum);
		System.out.println("sumid "+sum1);
	}
}
