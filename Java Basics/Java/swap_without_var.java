class swap_without_var {
public static void main(String[] args) {

int a=6,b=8;

a=a+b;
b=a-b;
a=a-b;

System.out.println(a);
System.out.println(b);

}
}