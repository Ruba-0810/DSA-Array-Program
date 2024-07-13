/*
Largest of 2 integer
*/
import java.util.*;
class program{
    public static void main (String [] args){
        //create two  integer
        int num1,num2;
        //read the data by scanner
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        //decision making
        if(num1<num2){
            System.out.println(num2);
        }else{
             System.out.println(num1);
        }

    }
}

