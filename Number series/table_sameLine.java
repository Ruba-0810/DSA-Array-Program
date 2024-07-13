//table in range and also in same line
import java.util.*;
class p7{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter start:");
        int start=sc.nextInt();
        System.out.print("Enter end:");
        int end=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            for(int j=end;j>=start;j--){
                System.out.print(j+" X "+i+" = "+(i*j)+"\t\t");
            }
            System.out.println();
        }

    }
}