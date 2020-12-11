package staticandoptional;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class CarDao {

    private List<Car> cars = Arrays.asList(
            new Car("AUDI", 15000),
            new Car("VW", 10000),
            new Car("BMW", 20000),
            new Car("TESLA", 80000),
            new Car("SMART", 5000)
    );

    public List<Car> findCars() {
        return cars;
    }

    public Car findOne(UUID id) {
        for (Car car : cars) {
            if (car.id.equals(id)) {
                return car;
            }
        }
        return null;
    }
}
