class spy_num {
public static void main (String [] args) {

int n=1241,s=0,p=1,temp=n;

while(n!=0) {
int rem = n%10;
s=s+rem;

p=p*rem;

n=n/10;
}

if (s==p) {
System.out.println(temp + " Is a Spy Num");
}
else {
System.out.println(temp + " Is not a Spy Num");
}

}
}
