//print all ailphabets from a to z
import java.util.*;
class p4{
    
    public static void main(String [] args){
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch+ " ");// ch++ ch+=1 ch=ch+1
        }
        System.out.println("************************************************");
         for(char ch1='a';ch1<='z';ch1=ch1+2){ //ch=ch+2 with it convert char to int
            System.out.print(ch1+ " ");
       }
        System.out.println("************************************************");
        for(char ch1='b';ch1<='z';ch1+=2){
            System.out.print(ch1+ " ");
       }
    }
}