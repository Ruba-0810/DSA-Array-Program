package Recursion.Permutation;

public class Count {
    public static void main(String[] args) {
        System.out.println( countnumber("","abc"));
    }
    static int countnumber(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char chr=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count +countnumber(f+chr+s,up.substring(1));
        }
        return count;
    }
}
