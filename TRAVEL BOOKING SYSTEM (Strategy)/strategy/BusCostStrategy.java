package travel.strategy;

import travel.model.*;

public class BusCostStrategy implements CostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {

        double baseRate = 0.1;
        double cost = request.getDistance() * baseRate;

        cost += request.getBaggageCount() * 5;

        cost = applyDiscount(cost, request.getDiscountType());

        return cost * request.getPassengers();
    }

    private double applyDiscount(double cost, DiscountType type) {
        switch (type) {
            case CHILD: return cost * 0.9;
            case PENSIONER: return cost * 0.95;
            default: return cost;
        }
    }
}
