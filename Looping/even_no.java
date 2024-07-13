//Write a java program to print the even numbers where m being the 
//lower bound and n being the upper bound...
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter n:");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
                if(i%2==0){
                    System.out.println(i+" ");
                }
            }
        }
    }

