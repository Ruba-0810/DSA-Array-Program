/*
enter the till the user and at the end it should 
display count of positive negative and zero
*/
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int positive=0;
        int negative=0;
        int zero=0;
        boolean ans=true;
        while(ans){
           System.out.print("Enter thw value:");
           int n=sc.nextInt();
           if(n<0){
              negative++;
           }
           else if(n>0){
            positive++;
           }
           else{
            zero++;
           }
        
        System.out.println("1.repeat\n2.stop");
        int input=sc.nextInt();
        if(input==2){
            ans=false;
        }
    }
        System.out.println(" +ve number:"+positive);
        System.out.println("-ve number:"+negative);
        System.out.println("zero:"+zero);
    }
}