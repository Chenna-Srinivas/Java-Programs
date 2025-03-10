class patterns34 {
public static void main(String[] args) {
int n=7,space=4,star=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=space;j++){
if(i==1 || i==2|| i==3){
System.out.print(" ");
}
else{
System.out.print("*");
for(int k=1;k<=star;k++){
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
}
}