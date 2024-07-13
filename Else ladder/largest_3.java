
/*
Design an app to read age of three siblings Ramu,
    Raghu and Raju and store them in a variable. 
    The app when executed  should display the age of the 
    youngest sibling. 
  */  
import java.util.*;
class program2{
    public static void main(String [] args){
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a:");
        int a=sc.nextInt();
        System.out.print("Enter the b:");
        int b=sc.nextInt();
        System.out.print("Enter the c:");
        int c=sc.nextInt();
        if(a<0 || b<0 || c<0){
           System.out.print("Age is invalid");
        }
        else{
            if(a<b && a<c){
            System.out.print(a);
        }else if(b<c){
            System.out.println(b);
        }else{
            System.out.print(c);
        }
        }
    }
}