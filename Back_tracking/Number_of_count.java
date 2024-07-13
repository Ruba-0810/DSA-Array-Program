package Back_tracking;

public class Number_of_count {
    public static void main(String[] args) {
        System.out.println(numberofcount(3,3));
    }
    static int numberofcount(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=numberofcount(r-1,c);
        int right=numberofcount(r,c-1);
        return left+right;
    }

}
