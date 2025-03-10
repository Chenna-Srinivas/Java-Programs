class sum_of_digits {
public static void main(String[] args) {

int n = 6532,sum = 0;
while(n!=0){
int rem = n%10;
sum = sum+rem;
n=n/10;
}
System.out.println(sum);
}
}