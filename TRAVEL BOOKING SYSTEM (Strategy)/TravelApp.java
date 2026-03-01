import travel.context.*;
import travel.model.*;
import travel.strategy.*;

import java.util.Scanner;

public class TravelApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TravelBookingContext context = new TravelBookingContext();

        System.out.println("1 - Plane");
        System.out.println("2 - Train");
        System.out.println("3 - Bus");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: context.setStrategy(new PlaneCostStrategy()); break;
            case 2: context.setStrategy(new TrainCostStrategy()); break;
            case 3: context.setStrategy(new BusCostStrategy()); break;
            default: throw new IllegalArgumentException("Invalid transport!");
        }

        System.out.print("Distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Passengers: ");
        int passengers = sc.nextInt();

        TravelRequest request = new TravelRequest(
                distance,
                passengers,
                ServiceClass.ECONOMY,
                DiscountType.NONE,
                1,
                false
        );

        double total = context.calculate(request);
        System.out.println("Total cost: " + total);
    }
}
