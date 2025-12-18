package DI;

import DI.Entities.Parcel;
import DI.Services.DeliveryService;
import DI.Services.NotificationService;
import DI.Services.PricingPolicy;
import DI.Transports.*;

import java.util.ArrayList;

public class Tests {
    public static void test() {
        ArrayList<Object> contentIds = new ArrayList<>();
        contentIds.add(1);
        contentIds.add(23);
        contentIds.add(456);
        contentIds.add(7890);
        contentIds.add(12345);

        PricingPolicy pricingPolicy = new PricingPolicy();
        NotificationService notificationService = new NotificationService();

        DeliveryService deliveryService = new DeliveryService(pricingPolicy, notificationService);

        Parcel parcel1 = new Parcel("Paczka 1", contentIds, "ul. Kwiatowa 15, 00-001 Warszawa", 2.5);
        Parcel parcel2 = new Parcel("Paczka 2", contentIds, "ul. Lipowa 7, 00-002 Kraków", 5.0);
        Parcel parcel3 = new Parcel("Paczka 3", contentIds, "ul. Dębowa 3, 00-003 Gdańsk", 10.0);

        deliveryService.sendPackage(parcel1, Plane.INSTANCE);
        deliveryService.sendPackage(parcel2, Truck.INSTANCE);
        deliveryService.sendPackage(parcel3, Plane.INSTANCE);
    }
}

