package stock.observer;

import java.util.*;

public class StockExchange implements Subject {

    private Map<String, List<Observer>> observers = new HashMap<>();
    private Map<String, Double> stocks = new HashMap<>();

    @Override
    public void subscribe(String stockName, Observer observer) {
        observers.computeIfAbsent(stockName, k -> new ArrayList<>()).add(observer);
    }

    @Override
    public void unsubscribe(String stockName, Observer observer) {
        if (observers.containsKey(stockName)) {
            observers.get(stockName).remove(observer);
        }
    }

    public void setStockPrice(String stockName, double price) {
        stocks.put(stockName, price);
        notifyObservers(stockName, price);
    }

    @Override
    public void notifyObservers(String stockName, double price) {
        if (observers.containsKey(stockName)) {
            for (Observer observer : observers.get(stockName)) {
                observer.update(stockName, price);
            }
        }
    }
}
