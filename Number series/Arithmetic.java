
/*
Input : a = 5, d = 2, n = 10
Output : 5 7 9 11 13 15 17 19 21 23
*/
import java.util.*;
class p1{
    public static void main(String[] args){
        int n=10;
        int a=5;
        int d=2;
        int sum=a;
        while(n>0){
            System.out.print(sum+" ");
           sum=sum+d;
           n--;
        }
    }
}