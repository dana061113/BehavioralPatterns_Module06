package travel.strategy;

import travel.model.*;

public class PlaneCostStrategy implements CostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {

        double baseRate = 0.5; // км бағасы
        double cost = request.getDistance() * baseRate;

        if (request.getServiceClass() == ServiceClass.BUSINESS) {
            cost *= 1.8;
        }

        cost += request.getBaggageCount() * 30;

        if (request.isWithTransfer()) {
            cost += 50;
        }

        cost = applyDiscount(cost, request.getDiscountType());

        return cost * request.getPassengers();
    }

    private double applyDiscount(double cost, DiscountType type) {
        switch (type) {
            case CHILD: return cost * 0.7;
            case PENSIONER: return cost * 0.8;
            default: return cost;
        }
    }
}
