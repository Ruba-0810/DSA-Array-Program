/*
USING FOR LOOP
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
    public static String xylemOrNot(int n){
        int lastvalue=n%10;
        n=n/10;
        int sum2=0;
        int i;
        for(i=n;i>9;i=i/10){
            sum2=sum2+i%10;
        }
        int sum1=lastvalue+i;
        if(sum1==sum2){
            return "Xylem";
        }
        return "Pylem";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(xylemOrNot(n));
    }
}