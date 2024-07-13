package Recursion.Letter;

import java.util.ArrayList;

public class Letter_Arraylist {
    public static void main(String[] args) {
       ArrayList<String>ans=phonenumber("","12");
        System.out.println(ans);

    }
    static ArrayList<String> phonenumber(String p,String up){
        if(up.isEmpty()){
           ArrayList<String>list=new ArrayList<>();
           list.add(p);
           return list;

        }

        int digit=up.charAt(0)-'0';// digit=1-->(1-0=1)
        ArrayList<String>answer=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char chr=(char)('a'+i);           //97+i=_____
            answer.addAll(phonenumber(p+chr,up.substring(1)));
        }
        return answer;
    }

}
