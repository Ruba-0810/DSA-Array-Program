//table in range
import java.util.*;
class p3{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter the start value:");
        int start=sc.nextInt();
        System.out.print("Enter the end value:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            for(int j=1;j<=10;j++){
              System.out.println(i+"X"+j+"="+(j*i));
            }
        }
    }
}
