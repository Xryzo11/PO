package NO_DI.Services;

import NO_DI.Entities.Parcel;
import NO_DI.Transports.TransportType;

public class PricingPolicy {
    public double getPrice(Parcel parcel, TransportType transportType) {
        double totalPrice = 0;
        totalPrice += (parcel.getWeightKg() * 2);
        switch (transportType.getType()) {
            case "Truck Transport":
                totalPrice += 5;
                break;
            case "Ship Transport":
                totalPrice += 15;
                break;
            case "Plane Transport":
                totalPrice += 25;
                break;
            default:
                totalPrice += 0;
                break;
        }
        return totalPrice;
    }
}
