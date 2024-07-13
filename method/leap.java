import java.util.*;
class p1{
    public static String leapNumber(int n){
        if((n%4==0  && n%100!=0) || n%400==0){
            return "Leap year";
        }
        return "Not leap year";
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter year number:");
      int n=sc.nextInt();
      System.out.println(leapNumber(n));  
    }
}
/*
 public static void leapNumber(int n){
        if((n%4==0  && n%100!=0) || n%400==0){
            System.out.println("Leap year");
        }else{
            System.out.println("not Leap year");
        }
        return ;
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter year number:");
      int n=sc.nextInt();
      leapNumber(n);  
    }
*/