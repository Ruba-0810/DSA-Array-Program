import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        boolean ruba=true;
        do{
            System.out.print("Enter the start:");
            int start=sc.nextInt();
            System.out.print("Enter the end:");
            int end=sc.nextInt();
            for(int i=start;i<=end;i++){
                int num=i;
                for(int j=1;j<=num;j++){
                System.out.println(j+" x "+num+" = "+(j*num));
              }
              System.out.println("***********************");
            }
            }
            System.out.println("1.repeat\n2.not repeat");
            int input=sc.nextInt();
            if(input==2){
                ruba=false;
            }
        }while(ruba);
    }
}