package stock.observer;

public interface Observer {
    void update(String stockName, double price);
}
