class no_of_digits{
public static void main (String [] args){

int n=6886,count=0;
while(n!=0){
n=n/10;
count++;
}
System.out.println(count);
}
}