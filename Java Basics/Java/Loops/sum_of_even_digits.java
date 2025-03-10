class sum_of_even_digits{
	public static void main(String[] args){
int i=25,even=0;
while(i<=51){
if(i%2==0){
even=even+i;
}
i++;
}
System.out.println(even);
}
}