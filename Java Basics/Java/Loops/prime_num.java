class prime_num {
public static void main (String [] args) {

int n=11,i=1,c=0;
while(i<=n){

if(n%i==0){
c++;
}
i++;
}

if(c==2) {
System.out.println(n + " Is a Prime Num");
}
else {
System.out.println(n + " Is Not a Prime Num");
}


}
}
