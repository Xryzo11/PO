package DI.Services;

import DI.Entities.Delivery;
import DI.Entities.Parcel;
import DI.Transports.TransportType;

public class DeliveryService {
    private final PricingPolicy pricingPolicy;
    private final NotificationService notificationService;

    public DeliveryService(PricingPolicy pricingPolicy, NotificationService notificationService) {
        this.pricingPolicy = pricingPolicy;
        this.notificationService = notificationService;
    }

    public void sendPackage(Parcel parcel, TransportType type) {
        double price = pricingPolicy.getPrice(parcel, type);
        Delivery newDelivery = new Delivery(parcel, type, price);
        notificationService.sendNotification(newDelivery);
    }
}

