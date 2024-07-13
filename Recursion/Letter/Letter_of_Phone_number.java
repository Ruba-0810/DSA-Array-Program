package Recursion.Letter;

public class Letter_of_Phone_number {
    public static void main(String[] args) {
       phonenumber("","12");
    }
    static void phonenumber(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';            // digit=1-->(1-0=1)
        for(int i=(digit-1)*3;i<digit*3;i++){
            char chr=(char)('a'+i);           //97+i=_____
            phonenumber(p+chr,up.substring(1));
        }
    }
}
