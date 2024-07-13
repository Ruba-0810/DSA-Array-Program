package Recursion;

public class Fibro {
    public static void main(String[] args) {
        System.out.println(fiboseries(8));
    }
    static int fiboseries(int n){
        if(n<2){
            return n;
        }
        return fiboseries(n-1)+fiboseries(n-2);
    }
}
