package Armstrong;

public class Main {
    static void armt(int n) {
        int sum = 0, r;
        while (n != 0) {
            r = n % 10;
            sum += Math.pow(r, 4);
            n /= 10;
        }
        if (n == sum) {
            System.out.println("is Armstrong");//return true
        } else {
            System.out.println("is not Armstrong");//return false
        }
    }

    public static void main(String[] args) {
        //153=1*3+5*3+3*3=153
        int  n=1234;
        /*
        if(armt(1234)){
          sout();
         */
        armt(1234);
                                           //SWAP method
        /*swap
        int temp=x
        x=y
        y=temp
         */

    }
}
