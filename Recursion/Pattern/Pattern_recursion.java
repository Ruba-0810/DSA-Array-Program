package Recursion.Pattern;

public class Pattern_recursion {
    public static void main(String[] args) {
        //pattern(4, 0);
        pattern1(4,0);
    }

    static void pattern(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            pattern(r, c + 1);
            System.out.print("*");
        } else {
            pattern(r - 1, 0);
            System.out.println();
        }
    }


    static void pattern1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            pattern1(r, c + 1);
        } else {
            System.out.println();
            pattern1(r - 1, 0);
        }
    }
}