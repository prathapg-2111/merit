public class FirebaseNotificationChannel implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Firebase notification: " + message);
    }
}