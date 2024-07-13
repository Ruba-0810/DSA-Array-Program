
//good moring sum 
import java.util.*;
class program4{
 public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>=5 && a<=11){
        System.out.println("Good Morning");
    }else if(a>=12 && a<=16){
         System.out.println("Good Afternoor");
    }else if(a>17 && a<=20){
        System.out.println("Good Evening");
    }else if(a>=21 && a<24 || a>=0 && a<=4 ){ // here when 23 reach 59 it will beCOME 0 OR NO SO WE USE A<24
        System.out.println("Good Night");
    }else{
          System.out.println("Invalid");
    }
 }
}