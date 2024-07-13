package Recursion;

public class Passing_number {
    public static void main(String[] args) {
        passing(5);
    }
    static void passing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        passing(--n);         //this one give 5,4,3,2,1
                              //passing(n--) this one give 5,5,5,5,5,5,5.................

    }
}
