class patterns15 {
public static void main(String[] args) {
int n=4;
char c='A';

for(int i=1; i<=n; i++) {
c='A';
for(int j=1; j<=n; j++) {

if (i==4 || j==1) {
System.out.print(c);
}
c++;
}
System.out.println();
}
}
}