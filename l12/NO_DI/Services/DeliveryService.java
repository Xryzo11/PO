package NO_DI.Services;

import NO_DI.Entities.Delivery;
import NO_DI.Entities.Parcel;
import NO_DI.Transports.TransportType;

public class DeliveryService {
    public void sendPackage(Parcel parcel, TransportType type) {
        PricingPolicy pricingPolicy = new PricingPolicy();
        NotificationService notificationService = new NotificationService();

        double price = pricingPolicy.getPrice(parcel, type);
        Delivery newDelivery = new Delivery(parcel, type, price);
        notificationService.sendNotification(newDelivery);
    }
}
