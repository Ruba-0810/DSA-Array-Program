//guess number

import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int magic_no=(int)(Math.random()*100);
       boolean ruba=true;
       do{
        System.out.print("Enter the guess number:");
        int guess_no=sc.nextInt();
        if(guess_no>magic_no){
            System.out.println("It is more magic no");
        }
        else if(guess_no<magic_no){
             System.out.println("It is low magic no");
        }else{
            System.out.println("It's matched");
            
            int count=0; 
            while(guess_no>0){
                guess_no/=10;
                count++;
            }
            System.out.println(count);
            System.out.println("1.repeat\n2.not repeat");
            int check=sc.nextInt();
            if(check==2){
                ruba=false;
            }
        }
       }while(ruba);

    }
}