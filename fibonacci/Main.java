package fibonacci;
//adding of first two number is next of previous number

public class Main {
    //method
    static int a=0,b=1,c;
    static void ruba(int count){
        if(count>0){
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;
            ruba(count-1);//method call itself
        }
    }
    public static void main(String[] args) {
        //for loop
//          int a=0,b=1,c,i,count=20;
//          System.out.print(a+" "+b);
//           for(i=2;i<=count;i++) {
//            c=a+b;
//            System.out.print(" " + c);
//            a = b;
//            b = c;

        //while loop
//        int a=0,b=1,c,i=2,count =20;
//        System.out.print(a+" "+b);
//        while(i<=count){
//            c=a+b;
//            System.out.print(" "+c);
//            a=b;
//            b=c;
//            i++;
        int count=20;
        System.out.print(a+" "+b);
        ruba(count-2);
        //when we create class then we need to create object
        //but we need method then we dont create object

        }
    }
