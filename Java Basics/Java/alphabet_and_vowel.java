class alphabet_and_vowel {
public static void main (String [] args) {
char c='a';

if((c>=65&&c<=90) || (c>=97&&c<=122)) {
System.out.println(c + " Is an Alphabet ");

  if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){

System.out.println(c + " Is also an Vowel ");
}
else
{
System.out.println(c + " But It Is a Consonant ");
}
}
else {
System.out.println(c + " Is not an Alphabet ");
}
}
}