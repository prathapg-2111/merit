import java.util.HashMap;
import java.util.Map;

public class RentalManager {
    private Map<String, Car> cars;

    public RentalManager() {
        cars = new HashMap<>();
    }

    public void registerCar(Car car) {
        cars.put(car.getId(), car);
    }

    public void setSpeedLimit(String carId, double speedLimit) {
        Car car = cars.get(carId);
        if (car != null) {
            car.setSpeedLimit(speedLimit);
        }
    }

    public void startRental(String carId, Customer customer, double speedLimit) {
        Car car = cars.get(carId);
        if (car != null) {
            car.setCurrentRenter(customer);
            car.setSpeedLimit(speedLimit);
        }
    }

    public void updateCarSpeed(String carId, double currentSpeed) {
        Car car = cars.get(carId);
        if (car != null) {
            car.setCurrentSpeed(currentSpeed);
        }
    }
}