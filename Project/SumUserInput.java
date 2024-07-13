import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int sum=0;
        String list="";//i need
        boolean ruba= true;
        do{
            System.out.print("Enter the number");
            int n=sc.nextInt();
            sum=sum+n;
            list=list+n+" ";
            System.out.println("1.repeat\n2.not repeat");
            int input=sc.nextInt();
            if(input==2){
                ruba =false;
            }

        }while(ruba);
        System.out.println(sum);
        System.out.println(list);

    }
}