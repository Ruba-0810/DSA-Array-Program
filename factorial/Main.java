package factorial;
public class Main {

    static int factorial(int n){
        if(n==0) {
            return 1;
        }
        else{
            return n*factorial(n-1);
            /*
            5*fact(4)
            4*fact(3)
            3*fact(2)
            2*fact(1)
            1*fact(0){not possible}
             */
        }
    }
    public static void main(String[] args) {
//    int i,fact=1,n=5;
//    for(i=1;i<=n;i++){
//        fact=fact*i;
//        System.out.println(fact);
//    }
        int result,n;
        System.out.println( factorial(5));

    }
}
