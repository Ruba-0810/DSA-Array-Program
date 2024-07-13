//palindrome
import java.util.*;
class p20{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int res=0;

        int temp=num;
        while(num>0){
            int last=num%10;
            res=res*10+last;
            num=num/10;
        }
        if(temp==res){
            System.out.println("Is palidrome");
        }else{
              System.out.println("Is  not palidrome");
        }
    }
}