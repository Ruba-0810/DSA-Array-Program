package Recursion;
                          /*
                          RECURSION FUNCTION
                           */
public class Recursion_Function {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        // this is base condition this is use to control the stack overflow

        //THIS IS BODY OF FUNCTION
        if(n==5){
            System.out.println(n);
            return;
        }
        //Recursion
        System.out.println(n);
        // tail recursion
        print(n+1);
    }
}
