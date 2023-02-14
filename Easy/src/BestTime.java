public class BestTime {

    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int currentProfit = 0;
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                currentProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, currentProfit);
            }
            else {
                left = right;
                right += 1;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {

    }
}
