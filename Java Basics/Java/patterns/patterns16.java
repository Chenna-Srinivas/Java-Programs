class patterns16 {
public static void main(String[] args) {
int n=4;
char ch='A',c='a';

for(int i=1; i<=n; i++) {
ch='A';
c='a';
for(int j=1; j<=n; j++) {

if(i%2==0) {
System.out.print(c );
c++;
}
else{
System.out.print(ch );
ch++;
}
}
System.out.println();
}
}
}
