import stock.observer.*;
import stock.subscribers.*;

public class StockApp {

    public static void main(String[] args) {

        StockExchange exchange = new StockExchange();

        Trader trader = new Trader("Alice");
        TradingRobot robot = new TradingRobot(100);

        exchange.subscribe("AAPL", trader);
        exchange.subscribe("AAPL", robot);

        exchange.setStockPrice("AAPL", 95);
        exchange.setStockPrice("AAPL", 120);
    }
}
