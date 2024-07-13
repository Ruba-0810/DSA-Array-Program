package Back_tracking;

import java.util.ArrayList;

public class Diagonal_path_Arraylist {
    public static void main(String[] args) {
        ArrayList<String>ans=path("",3,3);
        System.out.println(ans);

    }
    static ArrayList<String>path(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>answer=new ArrayList<>();
        if(r>1&&c>1){
           answer.addAll(path(p+'D',r-1,c-1));
        }
        if(r>1){
            answer.addAll(path(p+'d',r-1,c));
        }
        if(c>1){
            answer.addAll(path(p+'r',r,c-1));
        }
        return answer;
    }
}
