package NO_DI.Services;

import NO_DI.Entities.Delivery;

public class NotificationService {
    public void sendNotification(Delivery delivery) {
        System.out.println("Nadano nową paczkę:\n" + delivery);
    }
}
