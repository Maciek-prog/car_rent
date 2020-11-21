package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="Renting")
public class Renting {
    @Id
    @Column(name="id_customers")
    @GeneratedValue(generator = "rentingSeq")
    @GenericGenerator(name="rentingSeq", strategy="increment")
    private int id_customers;
    @Id
    @Column(name="id_car")
    private int id_car;
    @Column
    private long rent_date;
    @Column
    private long expiring_date;
//    @ManyToOne(mappedBy="car")
//    private Set<Items> item;

    public Renting(int id_customers, int id_car, long rent_date, long expiring_date) {
        this.id_customers = id_customers;
        this.id_car = id_car;
        this.rent_date = rent_date;
        this.expiring_date = expiring_date;
    }

    public int getId_customers() {
        return id_customers;
    }

    public void setId_customers(int id_customers) {
        this.id_customers = id_customers;
    }

    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public long getRent_date() {
        return rent_date;
    }

    public void setRent_date(long rent_date) {
        this.rent_date = rent_date;
    }

    public long getExpiring_date() {
        return expiring_date;
    }

    public void setExpiring_date(long expiring_date) {
        this.expiring_date = expiring_date;
    }

    @Override
    public String toString() {
        return "Renting{" +
                "id_customers=" + id_customers +
                ", id_car=" + id_car +
                ", rent_date=" + rent_date +
                ", expiring_date=" + expiring_date +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
