package problem;

public class count_digit {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(20));

    }
        static int evenlyDivides(int N){
            int count=0;
            int given_number=N;
            while(N>0){
                int lastdigits=N%10;
                if(lastdigits!=0 && given_number %lastdigits==0){
                    count++;
                }
                N=N/10;
            }
            return count;
        }
    }

