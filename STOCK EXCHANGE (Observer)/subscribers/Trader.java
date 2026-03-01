package stock.subscribers;

import stock.observer.Observer;

public class Trader implements Observer {

    private String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " received update: " + stockName + " = " + price);
    }
}
