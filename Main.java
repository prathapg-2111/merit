public class Main {
    public static void main(String[] args) {
        // Initialize managers
        RentalManager rentalManager = new RentalManager();

        // Add AWS notification channel (optional)
        NotificationService.getInstance().addChannel(new AWSNotificationChannel());

        // Create and register a car
        Car car1 = new Car("CAR001");
        rentalManager.registerCar(car1);

        // Create a customer
        Customer customer = new Customer("CUST001", "John Doe", "john@example.com");

        // Start rental with speed limit
        rentalManager.startRental("CAR001", customer, 120.0); // 120 km/h limit

        // Simulate speed updates
        rentalManager.updateCarSpeed("CAR001", 115.0); // Under limit - no notification
        rentalManager.updateCarSpeed("CAR001", 125.0); // Over limit - will trigger notification
    }
}