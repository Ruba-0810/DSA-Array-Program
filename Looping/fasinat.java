/*
Write a Java program to determine whether a given number is a fascinating number.
 A number is said to be fascinating if, after multiplying it by 2 and 3 separately 
 and concatenating the results with the original number, the resultant number 
 contains all the digits from 1 to 9 exactly once.
  For example, consider the number 327:
327 × 2 = 654
327 × 3 = 981
Concatenating these results with the original number gives:
          "327" + "654" + "981" = "327654981".
This resultant number contains all the digits from 1 to 9 exactly once,
 making 327 a fascinating number.
 */
import java.util.*;
class p17{
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        System.out.print("Enter binary value:");
        int n=sc.nextInt();
        boolean flag=true;
        int first=n*2;
        int second=n*3;
        String ruba="";
        ruba=ruba+n+first+second;
        for(char i='1';i<='9';i++){
           int count=0;
           for(int j=0;j<ruba.length();j++){
             if(ruba.charAt(j)==i){
                count++;
             }
           }
           if(count>1 || count==0){
            flag=false;
            break;
           }
        }
        if(flag){
            System.out.println("fascinating number.");
        }else{
              System.out.println("is not fascinating number.");
        }
    }
}
