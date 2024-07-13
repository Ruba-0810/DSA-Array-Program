package Recursion;

public class FunctionString {
    public static void main(String[] args) {
      message("hellow world");
    }
    static void message(String n){
        System.out.println(n);
        message1("hellow world");
    }
    static void message1(String n){
        System.out.println(n);
        message2("hellow world");
    }
    static void message2(String n){
        System.out.println(n);
        message3("hellow world");
    }
    static void message3(String n){
        System.out.println(n);
        message4("hellow world");
    }
    static void message4(String n){
        System.out.println(n);
        message5("hellow world");
    }
    static void message5(String n){
        System.out.println(n);

    }
}
