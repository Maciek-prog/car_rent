package org.example;

import pl.sda.dao.CarDao;
import pl.sda.dao.CustomersDao;
import pl.sda.dao.RentingDao;
import pl.sda.model.Car;
import pl.sda.model.Customers;

public class App {
    public static void main(String[] args) {
        CustomersDao customersDao = new CustomersDao();
        RentingDao rentingDao = new RentingDao();
        CarDao carDao = new CarDao();
        Customers customers = new Customers(1,"Mariusz", "Kowalski");
        Customers customers1 = new Customers(2,"Lucek", "Mieczewski");
        Customers customers2 = new Customers(3,"Marek", "Klimczak");
        Customers customers3 = new Customers(4,"Kacper", "Kieczewski");
        customersDao.add(customers);
        customersDao.add(customers1);
        customersDao.add(customers2);
        customersDao.add(customers3);
        Car car = new Car(1,"Ford","Mustang", "Red", "RC 27435",true);
        Car car1 = new Car(2,"Skoda","Octavia","Blue","RX 89612",false);
        Car car2 = new Car(3,"volkswagen","Lupo","Blue","PCT 23124",true);

        carDao.add(car);
        carDao.add(car1);
        carDao.add(car2);

    }
}
