class patterns30 {
public static void main(String[] args) {
int n=7,space=3,star=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=space;j++){
System.out.print(" ");
}
for(int k=1;k<=star;k++){
System.out.print("*");
}
if(i<4){
star++;
space--;
}
else{
star--;
space++;
}
System.out.println();
}
}
}