import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        boolean ruba=true;
        do{
            System.out.println("1.print 1 to n\n2.print a to z\3.Exit");
            int input=sc.nextInt();
            //String ans="";
            //String ans1="";
            if(input==1){
                System.out.print("Enter number:");
                int num=sc.nextInt();//10
                for(int i=1;i<=num;i++){
                    System.out.println(i);
                }
            }
            else if(input==2){
               System.out.print("Enter character:");
                char ch=sc.next().charAt(0);//10
              for(char i=ch;i<='Z';i++){
                System.out.println(i);
              }
            }
            else{
                System.out.println("Thank you:)");
              ruba=false;
            }
        }while(false);
        
    }
}