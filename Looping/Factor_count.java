//Write a java program to count the number of factors of a given integer number.
import java.util.*;
class factor{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
		System.out.print("Enter the n value");
		int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}