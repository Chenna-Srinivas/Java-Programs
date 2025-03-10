class leap_year_org {
    
    public static void main(String[] args) {
        int year=2011;
        if((year%4==0 && year%100!=0) || ( year%400==0)){
            System.out.println(year+ " Is a Leap Year");
        }
        else{
            System.out.println(year+ " Is not a Leap Year");
}
}
}