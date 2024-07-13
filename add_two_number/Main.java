package add_two_number;

public class Main {
    static int sum_digits(int n) {
        if(n==0){
            return 0;
        }
        else{
            return (n%10+sum_digits(n/10));
                /*

                return 3+sum(12)
                return2+sum(1)
                return1==>6
                 */
        }
    }

        public static void main (String[]args){
            int n,result;
             result =sum_digits(123);
            System.out.println(result);

        }
    }

