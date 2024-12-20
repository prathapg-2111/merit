public class Car {
    private String id;
    private double currentSpeed;
    private Customer currentRenter;
    private double speedLimit;

    public Car(String id) {
        this.id = id;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    public void setCurrentSpeed(double speed) {
        this.currentSpeed = speed;
        checkSpeedLimit();
    }

    private void checkSpeedLimit() {
        if (currentSpeed > speedLimit) {
            NotificationService.getInstance().notifySpeedExceeded(this, currentRenter);
        }
    }

    public String getId() {
        return id;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentRenter(Customer renter) {
        this.currentRenter = renter;
    }
}