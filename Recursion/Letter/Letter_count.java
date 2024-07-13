package Recursion.Letter;

public class Letter_count {
    public static void main(String[] args) {
        System.out.println(phonenumber("","123"));

    }
    static int  phonenumber(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        int digit=up.charAt(0)-'0';            // digit=1-->(1-0=1)
        for(int i=(digit-1)*3;i<digit*3;i++){
            char chr=(char)('a'+i);           //97+i=_____
            count=count+phonenumber(p+chr,up.substring(1));
        }
        return count;
    }
}
