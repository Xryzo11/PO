package DI.Services;

import DI.Entities.Delivery;

public class NotificationService {
    public void sendNotification(Delivery delivery) {
        System.out.println("Nadano nową paczkę:\n" + delivery);
    }
}

