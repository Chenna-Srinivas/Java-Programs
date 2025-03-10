class seq_using_two_var {
public static void main(String[] args) {
int i = 1;
char c = 'A';
while(i<=26){
System.out.println(c + " "+ i + (char)(c+32));
i++;
c++;
}
}
}