import java.util.*;
class p1{
     static Scanner sc=new Scanner(System.in);
     public static void main(String[] args){
       
        boolean ruba=true;
        do{
        System.out.println("\t\t\tSelect the option");
        System.out.println("1.Addition\n2.Subraction\n3.multipication\n4.Division");
        System.out.print("Enter the number");
        int n=sc.nextInt();

        switch(n){
            case 1:{
                System.out.print("Enter the a");
                 int a=sc.nextInt();
                System.out.print("Enter the b");
                 int b=sc.nextInt();
                 int res=add(a,b);
                 System.out.println(res);
                break;
            }
            case 2:{
                System.out.print("Enter the a");
                 int a=sc.nextInt();
                 System.out.print("Enter the b");
                 int b=sc.nextInt();
                int sub=add(a,b);
                System.out.println(sub);
                break;
            }
            case 3:{
                System.out.print("Enter the a");
                 int a=sc.nextInt();
                System.out.print("Enter the b");
                 int b=sc.nextInt();
                int mul=mul(a,b);
                System.out.println(mul);
                break;
            }
            case 4:{
                System.out.print("Enter the a");
                 int a=sc.nextInt();
                 System.out.print("Enter the b");
                 int b=sc.nextInt();
                int div=div(a,b);
                System.out.println(div);
                break;
            }
            default:{
                 System.out.println("1.repeat\n2.Not repeat");
                System.out.print("Enter the number");
                int i=sc.nextInt();
                if(i==2){
                    System.out.print("bye");
                    ruba=false;
                }
            }

        }
    }while(ruba);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a+b;
    }
    public static int div(int a,int b){
        return a/b;
    }
}