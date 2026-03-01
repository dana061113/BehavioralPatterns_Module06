package travel.context;

import travel.model.TravelRequest;
import travel.strategy.CostCalculationStrategy;

public class TravelBookingContext {

    private CostCalculationStrategy strategy;

    public void setStrategy(CostCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(TravelRequest request) {

        if (strategy == null) {
            throw new IllegalStateException("Strategy not selected!");
        }

        return strategy.calculateCost(request);
    }
}
