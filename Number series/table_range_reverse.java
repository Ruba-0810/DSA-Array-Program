//table in range
import java.util.*;
class p5{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter start:");
        int start=sc.nextInt();
        System.out.print("Enter end:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            for(int j=10;j>=1;j--){
                System.out.println(i+"X"+j+"="+(i*j)+"\t");
            }
            System.out.println("************************");
        }

    }
}