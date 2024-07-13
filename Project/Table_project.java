import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        boolean ruba=true;
        do{
            System.out.print("Enter the number:");
            int num=sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(i+" x "+num+" = "+(i*num));
            }
            System.out.println("1.repeat\n2.not repeat");
            int input=sc.nextInt();
            if(input==2){
                ruba=false;
            }
        }while(ruba);
    }
}