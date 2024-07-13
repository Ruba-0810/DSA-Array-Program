
/*design method can accept an int and return true if int is prime
false if is not a prime
*/
import java.util.*;
public class prime{
 static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int n=sc.nextInt();
        if(isPrime(n)){
           System.out.println("it is prime number");
        }else{
            System.out.println("it is prime number");
        }
        
    }
    public static boolean isPrime(int num){
        int count=2;
        for(int i=2;i<num;i++){
            if(num%2==0){
               count++;
            }
        }
        return count==2;
        
    }
}