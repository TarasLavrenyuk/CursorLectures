package staticandoptional;

import java.util.Optional;
import java.util.UUID;

import static java.util.Optional.of;

public class MainOptional {

    public static void main(String[] args) {
        final CarDao carDao = new CarDao();

        Optional<Car> car1 = Optional.ofNullable(carDao.findOne(UUID.randomUUID()));

//        old approach
//        if (car1 != null) {
//            System.out.println(car1.model);
//        }

//        new approach
//        System.out.println(car1.get());
//        car1.ifPresent(car -> System.out.println(car));
//        System.out.println(car1.orElse(new Car("", 0)));
//
        car1.orElseThrow(NullPointerException::new);
    }
}
