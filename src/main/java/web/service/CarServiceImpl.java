package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Ford Mustang", "Red", 125_000));
        cars.add(new Car("Opel Astra", "Grey", 15_000));
        cars.add(new Car("BMW", "Blue", 30_000));
        cars.add(new Car("Ford Kuga", "White", 21_000));
        cars.add(new Car("BMW", "Blue", 35_000));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
