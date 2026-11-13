package pt.ipp.estg.pp.pp_fp08.stand;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Condition;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Origin;

/**
 *
 * @author luism
 */
public class Car extends Vehicle {

    public static final int DEFAULT_DOORS_NUMBER = 3;

    private int occupantsNumber;
    private int doorsNumber;

    public Car(String vin, String brand, String model, LocalDate manufacturingDate,
            Origin origin, int kms, Condition condition, int price, int occupantsNumber) {
        this(vin, brand, model, manufacturingDate, origin, kms, condition, price,
                occupantsNumber, DEFAULT_DOORS_NUMBER);
    }

    public Car(String vin, String brand, String model, LocalDate manufacturingDate,
            Origin origin, int kms, Condition condition, int price,
            int occupantsNumber, int doorsNumber) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.occupantsNumber = occupantsNumber;
        this.doorsNumber = doorsNumber;
    }

    public int getOccupantsNumber() {
        return occupantsNumber;
    }

    public void setOccupantsNumber(int occupantsNumber) {
        this.occupantsNumber = occupantsNumber;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    @Override
    public int getPrice() {
        if (getCondition() == Condition.USED) {
            return super.getPrice() * 70 / 100;
        }
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Car -> " + super.toString()
                + ", Occupants: " + occupantsNumber
                + ", Doors: " + doorsNumber;
    }
}
