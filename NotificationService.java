import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private static NotificationService instance;
    private List<NotificationChannel> channels;

    private NotificationService() {
        channels = new ArrayList<>();
        channels.add(new FirebaseNotificationChannel());
    }

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void addChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    public void notifySpeedExceeded(Car car, Customer customer) {
        String message = String.format(
            "ALERT: Car %s rented by %s exceeded speed limit. Current speed: %.1f",
            car.getId(), customer.getName(), car.getCurrentSpeed()
        );

        for (NotificationChannel channel : channels) {
            channel.sendNotification(message);
        }
    }
}