package SlidingWindows.BuySellStocks;

public class BuySellStocks {

    public static int maxProfit(int[] stocksP){
        int max = stocksP[0];
        int profit = 0;

        for(int i = 0; i < stocksP.length; i++){
            if(stocksP[i] < max){
                max = stocksP[i];
            }
            profit = Math.max(profit, stocksP[i] - max);
        }
        return profit;
    }

    public static void main(String args[]){

        int[] stocksPrice = new int[]{7,1,3,6,2};
        System.out.println(maxProfit(stocksPrice));
    }
}
