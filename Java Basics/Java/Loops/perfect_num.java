class perfect_num {
public static void main (String [] args) {

int n=11,i=1,perfect=0;
while (i<n) {

if (n%i==0) {
perfect = i+perfect;
}

i++;
}

if(perfect==n){
System.out.println(n + " Is a Perfect Number");
}
else {
System.out.println(n + " Is Not a Perfect Number");
}

}
}