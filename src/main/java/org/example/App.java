package org.example;

import pl.sda.dao.CustomersDao;
import pl.sda.dao.RentingDao;
import pl.sda.model.Car;
import pl.sda.model.Customers;

public class App {
    public static void main(String[] args) {
        CustomersDao customersDao = new CustomersDao();
        RentingDao rentingDao = new RentingDao();
        Customers customers = new Customers(1,"Mariusz", "Kowalski");
        Customers customers1 = new Customers(2,"Lucek", "Mieczewski");
        customersDao.add(customers);
        customersDao.add(customers1);

    }
}
