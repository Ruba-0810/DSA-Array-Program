//find largest
import java.util.*;
class program3{
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         int b=sc.nextInt();
          int c=sc.nextInt();
           int d=sc.nextInt();
           if(a>b && a>b && a>d){
            System.out.println(a);
           }else if(b>c && b>d){
              System.out.println(b);
           }else if(c>d){
              System.out.println(c);
           }else{
               System.out.println(d);
           }

    }
}