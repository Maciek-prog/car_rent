package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="Car")

public class Car {
    @Id
    @Column(name="id")
    @GeneratedValue(generator = "carSeq")
    @GenericGenerator(name="carSeq", strategy="increment")
    private int id;
    @Column
    private String marka;
    @Column
    private String model;
    @Column
    private String color;
    @Column
    private String nr_rejestracyjny;
    @Column
    private boolean car_condition;

    public Car(int id, String marka, String model, String color, String nr_rejestracyjny, boolean car_condition) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.nr_rejestracyjny = nr_rejestracyjny;
        this.car_condition = car_condition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNr_rejestracyjny() {
        return nr_rejestracyjny;
    }

    public void setNr_rejestracyjny(String nr_rejestracyjny) {
        this.nr_rejestracyjny = nr_rejestracyjny;
    }

    public boolean isCar_condition() {
        return car_condition;
    }

    public void setCar_condition(boolean car_condition) {
        this.car_condition = car_condition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", nr_rejestracyjny='" + nr_rejestracyjny + '\'' +
                ", car_condition=" + car_condition +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
