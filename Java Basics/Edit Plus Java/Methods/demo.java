class  demo
{
	public static void main(String[] args) 
	{
		int n=999,temp=n,sum=0,temp1;
			while(n>0)
			{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			}
			temp1=sum;
			int sum1=0;
		while(sum>9)
		{
		int rem1=sum%10;
		
		sum1=sum1+rem1;
		sum=sum/10;
		}
		System.out.println(sum1);
		
	}
}
