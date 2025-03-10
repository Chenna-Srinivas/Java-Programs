class patterns23 {
public static void main(String[] args) {

int n=4,star=4,space=0;

for(int i=1;i<=n;i++){
for(int j=1;j<=space;j++){

System.out.print(" ");
}
for(int k=1;k<=star;k++){
if((i==2&&k==2) || (i==4&&k==1)){
System.out.print("$");
}
else{
System.out.print("*");
}
}
space++;
star--;
System.out.println();
}
}
}
