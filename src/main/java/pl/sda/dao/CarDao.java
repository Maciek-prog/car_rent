package pl.sda.dao;

import pl.sda.model.Car;
import pl.sda.model.Customers;

public class CarDao extends AbstractDao<Car> {

    public CarDao() {
        super(Car.class);
    }
}
