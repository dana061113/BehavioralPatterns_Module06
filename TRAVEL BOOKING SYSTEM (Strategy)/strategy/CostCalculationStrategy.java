package travel.strategy;

import travel.model.TravelRequest;

public interface CostCalculationStrategy {
    double calculateCost(TravelRequest request);
}
