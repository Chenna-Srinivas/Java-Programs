class patterns21 {
public static void main(String[] args) {

int n=4,star=1,space=3;

for(int i=1;i<=n;i++){
for(int j=1;j<=space;j++){

System.out.print(" ");
}
for(int k=1;k<=star;k++){
System.out.print("*");
}
space--;
star++;
System.out.println();
}
}
}