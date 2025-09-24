package best.time.to.buy.and.sell.stocks;

class BestTimeToBuyAndSellStocks {

    int solution(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int price = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < price) {
                price = prices[i];
            } else if (prices[i] - price > profit) {
                profit = prices[i] - price;
            }
        }
        return profit;
    }

}
