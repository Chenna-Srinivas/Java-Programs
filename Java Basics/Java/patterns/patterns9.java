class patterns9 {
public static void main(String[] args) {
int row=4;
int col=4;

for(int i=1; i<=row; i++) {
for(int j=1; j<=col; j++) {

if (i==j) {
System.out.print("$ ");
}
else {
System.out.print("* ");
}
}
System.out.println();
}
}
}