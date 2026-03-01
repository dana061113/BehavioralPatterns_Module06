package stock.observer;

public interface Subject {
    void subscribe(String stockName, Observer observer);
    void unsubscribe(String stockName, Observer observer);
    void notifyObservers(String stockName, double price);
}
