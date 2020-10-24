package pl.sda.model;

public class Car {
    private int id;
    private String marka;
    private String model;
    private String color;
    private String nr_rejestracyjny;

    public Car(int id, String marka, String model, String color, String nr_rejestracyjny) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.nr_rejestracyjny = nr_rejestracyjny;
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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", nr_rejestracyjny='" + nr_rejestracyjny + '\'' +
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
