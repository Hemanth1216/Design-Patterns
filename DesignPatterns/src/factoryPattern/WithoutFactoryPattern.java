package factoryPattern;

public class WithoutFactoryPattern {

	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		notificationService.sendNotification("EMAIL");
		notificationService.sendNotification("SMS");
	}
}

//Notification interface
interface Notification {
 void notifyUser();
}

//Concrete implementations
class EmailNotification implements Notification {
 public void notifyUser() {
     System.out.println("Sending Email Notification");
 }
}

class SMSNotification implements Notification {
 public void notifyUser() {
     System.out.println("Sending SMS Notification");
 }
}

//Client code
class NotificationService {
 public void sendNotification(String type) {
     Notification notification;

     if (type.equalsIgnoreCase("EMAIL")) {
         notification = new EmailNotification();
     } else if (type.equalsIgnoreCase("SMS")) {
         notification = new SMSNotification();
     } else {
         throw new IllegalArgumentException("Unknown notification type");
     }

     notification.notifyUser();
 }
}
