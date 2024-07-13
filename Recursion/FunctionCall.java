package Recursion;

//
public class FunctionCall {

                            /*
                            This one is correct because they said we need to write one function print(1)
                             */
    public static void main(String[] args) {
      print(1);
    }
    static void print(int n){
        System.out.println(n);
        print1(2);
    }

    static void print1(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(3);
    }
    static void print4(int n){
        System.out.println(n);
        print5(3);
    }
    static void print5(int n){
        System.out.println(n);

    }


                     /*
                     This one is wrong
                      */

//    public static void main(String[] args) {
//        print(1);
//        print(2);
//        print(3);
//        print(4);
//        print(5);
//
//
//    }
//    static void print(int n);
//    {
//        System.out.println(n);
//    }
}
