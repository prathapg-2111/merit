public class AWSNotificationChannel implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("AWS notification: " + message);
    }
}