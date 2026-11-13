package pt.ipp.estg.pp.pp_fp08.stand;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Condition;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Origin;

/**
 *
 * @author luism
 */
public class Vehicle {

    private static int nextId = 1;

    private final int id;
    private String vin;
    private String brand;
    private String model;
    private LocalDate manufacturingDate;
    private Origin origin;
    private int kms;
    private Condition condition;
    private int price;

    public Vehicle(String vin, String brand, String model, LocalDate manufacturingDate,
            Origin origin, int kms, Condition condition, int price) {
        this.id = nextId++;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.origin = origin;
        this.kms = kms;
        this.condition = condition;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vehicle other)) {
            return false;
        }
        return vin != null && vin.equals(other.vin);
    }

    @Override
    public int hashCode() {
        return vin == null ? 0 : vin.hashCode();
    }

    @Override
    public String toString() {
        return "ID: " + id
                + ", VIN: " + vin
                + ", Brand: " + brand
                + ", Model: " + model
                + ", Manufacturing date: " + manufacturingDate
                + ", Origin: " + origin
                + ", Kms: " + kms
                + ", Condition: " + condition.conditionToString()
                + ", Price: " + getPrice() + " EUR";
    }
}
