//reverse the table
import java.util.*;
class p8{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter start:");
        int start=sc.nextInt();
        System.out.print("Enter end:");
        int end=sc.nextInt();
        for(int i=10;i>=1;i--){
            for(int j=end;j>=start;j--){
                System.out.print(i+"X"+j+"="+(i*j)+"\t");
            }
             System.out.println(); 
        }

    }
}
