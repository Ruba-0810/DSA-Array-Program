import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int count=2;
        for(int i=n-1;i>=2;i--){
            if(n%i==0){
               count++; 
            }
        }
        if(count==2){
            System.out.println("Is prime number");
        }else{
             System.out.println("Is not prime number");
        }
    }
}