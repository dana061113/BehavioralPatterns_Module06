package stock.subscribers;

import stock.observer.Observer;

public class TradingRobot implements Observer {

    private double threshold;

    public TradingRobot(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(String stockName, double price) {

        if (price < threshold) {
            System.out.println("Robot: BUY " + stockName);
        } else {
            System.out.println("Robot: SELL " + stockName);
        }
    }
}
