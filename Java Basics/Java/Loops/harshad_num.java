class harshad_num {
public static void main (String [] args) {

int n=6811,temp=n,sum=0;

while(n!=0) {

int rem = n%10;
sum = sum+rem;
n=n/10;
}

if(temp%sum==0) {
System.out.println( temp + " Is A Harshad Number");
}
else {
System.out.println( temp + " Is Not Harshad Number");
}

}
}