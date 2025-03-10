class patterns6 {
public static void main(String[] args) {
int row=4;
int col=4;

for(int i=1; i<=row; i++) {
for(int j=1; j<=col; j++) {
if((i==1) || (i==4)) {

System.out.print("A ");
}
else{
System.out.print("* ");
}
}
System.out.println(" ");
}
}
}