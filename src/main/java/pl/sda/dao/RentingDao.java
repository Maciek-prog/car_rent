package pl.sda.dao;

import pl.sda.model.Customers;
import pl.sda.model.Renting;

public class RentingDao extends AbstractDao<Renting>{
    public RentingDao() {
        super(Renting.class);
    }
}
