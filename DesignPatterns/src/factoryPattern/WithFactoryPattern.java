package factoryPattern;

public class WithFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationServices notificationService = new NotificationServices();
		notificationService.sendNotification("EMAIL");
		notificationService.sendNotification("SMS");
	}
}

//Notification interface
interface Notifications {
 void notifyUser();
}

//Concrete implementations
class EmailNotifications implements Notifications {
 public void notifyUser() {
     System.out.println("Sending Email Notification with Factory Pattern");
 }
}

class SMSNotifications implements Notifications {
 public void notifyUser() {
     System.out.println("Sending SMS Notification with Factory Pattern");
 }
}

//Factory class
class NotificationFactory {
 public static Notifications createNotification(String type) {
     if (type.equalsIgnoreCase("EMAIL")) {
         return new EmailNotifications();
     } else if (type.equalsIgnoreCase("SMS")) {
         return new SMSNotifications();
     } else {
         throw new IllegalArgumentException("Unknown notification type");
     }
 }
}

//Client code
class NotificationServices {
 public void sendNotification(String type) {
     Notifications notification = NotificationFactory.createNotification(type);
     notification.notifyUser();
 }
}

