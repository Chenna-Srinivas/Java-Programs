class sum_of_numbers{
public static void main(String[] args) {
        int i=1,even=0,odd=0;
        while(i<=10){
            if(i%2==0){
                even=even+i;
            }
            else{
                odd=odd+i;
            }
            i++;
        }
        
            System.out.println(even );
        System.out.println(odd);
}
}