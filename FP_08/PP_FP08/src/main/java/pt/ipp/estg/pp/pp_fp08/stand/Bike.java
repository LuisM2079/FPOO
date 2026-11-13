package pt.ipp.estg.pp.pp_fp08.stand;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Condition;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Origin;

/**
 *
 * @author luism
 */
public class Bike extends Vehicle {

    private int cubicCapacity;
    private int wheelSize;

    
    public Bike(String vin, String brand, String model, LocalDate manufacturingDate,
            Origin origin, int kms, Condition condition, int price,
            int cubicCapacity, int wheelSize) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.cubicCapacity = cubicCapacity;
        this.wheelSize = wheelSize;
    }

    
    public int getCubicCapacity() {
        return cubicCapacity;
    }

    
    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    
    public int getWheelSize() {
        return wheelSize;
    }

    
    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    
    @Override
    public int getPrice() {
        return super.getPrice();
    }

    
    @Override
    public String toString() {
        return "Bike -> " + super.toString()
                + ", Cubic capacity: " + cubicCapacity
                + ", Wheel size: " + wheelSize;
    }
}
