class sum_of_factors {
public static void main (String [] args) {

int n=8,i=1,s=0;
while(i<=n){

if(n%i==0){
s=s+i;
}
i++;
}
System.out.println(s);

}
}