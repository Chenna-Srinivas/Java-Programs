class patterns26 {
public static void main(String[] args) {

int n=4,sp=3;

for(int i=1;i<=n;i++){
for(int j=1;j<=sp;j++){

System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print(k);
}
sp--;
System.out.println();
}
}
}