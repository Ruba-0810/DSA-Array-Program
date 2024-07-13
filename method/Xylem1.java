/*
USING WHILE LOOP
	Input  : 1235
	Output : Harmony

Test Case 2: 

	Input  : 2468
	Output : Harmony

Test Case 3: 

	Input  : 9474
	Output : Non-Harmony



 */
import java.util.*;
class p1{
    public static String xylemOrNotxylem(int n){
        if(n<100){
            return "Invalid";
        }
        int temp=n;
        int lastvalue=n%10;
        n=n/10;
        while(n>9){
            n=n/10;
        }
        int sum1=lastvalue+n;
        temp=temp/10;
        int sum2=0;
        while(temp>9){
            sum2=sum2+temp%10;
            temp=temp/10;
        }
        if(sum1==sum2){
            return "Xylem";
        }
        return "pyleom";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans=xylemOrNotxylem(n);
        System.out.println(ans);
    }
}