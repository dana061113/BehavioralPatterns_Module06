package travel.strategy;

import travel.model.*;

public class TrainCostStrategy implements CostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {

        double baseRate = 0.2;
        double cost = request.getDistance() * baseRate;

        if (request.getServiceClass() == ServiceClass.BUSINESS) {
            cost *= 1.4;
        }

        cost += request.getBaggageCount() * 10;

        cost = applyDiscount(cost, request.getDiscountType());

        return cost * request.getPassengers();
    }

    private double applyDiscount(double cost, DiscountType type) {
        switch (type) {
            case CHILD: return cost * 0.85;
            case PENSIONER: return cost * 0.9;
            default: return cost;
        }
    }
}
