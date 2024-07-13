package Recursion.Permutation;

public class permutation_method {
    public static void main(String[] args) {
        permutation("", "abc");
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char chr = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + chr + s, up.substring(1));

        }
    }
}
