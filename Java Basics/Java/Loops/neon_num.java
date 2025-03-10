class neon_num {
public static void main (String [] args) {

int n=9,sum=0,sq=n*n;


while(sq!=0) {
int rem = sq%10;
sum=sum+rem;
sq=sq/10;
}


if (n==sum) {
System.out.println(n + " Is a Neon Num");
}
else {
System.out.println(n + " Is not a Neon Num");
}

}
}