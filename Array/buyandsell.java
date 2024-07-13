package Array;

public class buyandsell {
    static int buyprice(int[] num){

        if (num == null || num.length == 0) {
            return 0;
        }
        int profit, buy_price;
        profit = 0;
        buy_price = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] <= buy_price) {
                buy_price = num[i];
                continue;
            }
            profit = Math.max(profit, num[i] - buy_price);//overall profit=profit
        }
        return profit;
    }

    public static void main(String[] args) {
        int[]num={7,1,5,3,6,4};
        System.out.println(buyprice(num));
    }
}
