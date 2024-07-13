import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        boolean ruba=true;
    do{
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        
        if(num>max){
            max=num;
        }
        if(num<min){
            min=num;
        }
        System.out.println("1.repeat\n2.not repeat");
        int input=sc.nextInt();
        if(input==2){
            ruba=false;
        }
       }while(ruba);
       System.out.println(max);
       System.out.println(min);
    }
}