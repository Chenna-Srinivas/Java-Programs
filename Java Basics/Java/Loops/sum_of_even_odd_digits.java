class sum_of_even_odd_digits {
public static void main (String [] args) {

int n=8123415,even=0,odd=0;
while(n!=0) {
int rem=n%10;

if(rem%2==0) {
even=even+rem;
}
else {
odd=odd+rem;
}
n=n/10;
}
System.out.println("Sum of even digits = " + even);
System.out.println("Sum of odd digits = " + odd);

}

}