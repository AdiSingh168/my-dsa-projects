package best.time.to.buy.and.sell.stocks.two;

class BestTimeToBuyAndSellStocksTwo {

    int solution(int[] profits) {
        if (profits == null || profits.length < 2) {
            return 0;
        }
        int length = profits.length;
        int profit = 0;
        int buyPrice = profits[0];
        for (int i = 1; i < length; i++) {
            if (profits[i] > buyPrice) {
                profit += profits[i] - buyPrice;
                buyPrice = profits[i];
            } else {
                buyPrice = profits[i];
            }
        }
        return profit;
    }

}
