class patterns29 {
public static void main(String[] args) {
int n=7,star=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=star;j++){
System.out.print("*");
}
if(i<4){
star++;
}
else{
star--;
}
System.out.println();
}
}
}