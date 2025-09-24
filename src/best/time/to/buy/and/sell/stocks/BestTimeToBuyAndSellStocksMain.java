package best.time.to.buy.and.sell.stocks;

public class BestTimeToBuyAndSellStocksMain {

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        BestTimeToBuyAndSellStocks solution = new BestTimeToBuyAndSellStocks();
        System.out.println(solution.solution(prices));
    }

}
