//factorial
import java.util.*;
class p13{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enyer the n value:");
        int n=sc.nextInt();
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        System.out.println(res);
    }
}