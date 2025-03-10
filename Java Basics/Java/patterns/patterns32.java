class pattern32 {
public static void main(String[] args) {

int n=5,space=2,star=1;

for(int i=1;i<=n;i++){

for(int j=1;j<=space;j++){
System.out.print(" ");
}

for(int k=1;k<=star;k++){

if(i==3&&k==3){
System.out.print("$");
}
else{
System.out.print("*");
}

if(i<=3){
space--;
star=star+2;
}
else{
space++;
star=star-2;
}
}
System.out.println();
}
}
}