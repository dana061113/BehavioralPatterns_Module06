package travel.model;

public class TravelRequest {

    private double distance;
    private int passengers;
    private ServiceClass serviceClass;
    private DiscountType discountType;
    private int baggageCount;
    private boolean withTransfer;

    public TravelRequest(double distance, int passengers,
                         ServiceClass serviceClass,
                         DiscountType discountType,
                         int baggageCount,
                         boolean withTransfer) {

        this.distance = distance;
        this.passengers = passengers;
        this.serviceClass = serviceClass;
        this.discountType = discountType;
        this.baggageCount = baggageCount;
        this.withTransfer = withTransfer;
    }

    public double getDistance() { return distance; }
    public int getPassengers() { return passengers; }
    public ServiceClass getServiceClass() { return serviceClass; }
    public DiscountType getDiscountType() { return discountType; }
    public int getBaggageCount() { return baggageCount; }
    public boolean isWithTransfer() { return withTransfer; }
}
