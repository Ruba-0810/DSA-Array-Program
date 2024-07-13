/*
smallest ascii value 
input:F,R
output:F
*/

import java.util.*;
class program1{
    public static void main(String [] args){
        char a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
        b=sc.next().charAt(0);
        if(a>b){
            System.out.println(b);
        }else{
             System.out.println(a);
        }
    }
}