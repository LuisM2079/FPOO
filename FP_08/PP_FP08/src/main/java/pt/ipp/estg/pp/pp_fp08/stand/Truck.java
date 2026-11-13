package pt.ipp.estg.pp.pp_fp08.stand;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Condition;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Origin;
import pt.ipp.estg.pp.pp_fp08.stand.enums.TruckType;
import pt.ipp.estg.pp.pp_fp08.stand.trailer.Trailer;

/**
 *
 * @author luism
 */
public class Truck extends Vehicle {

    private double length;
    private double load;
    private TruckType truckType;
    private Trailer trailer;

    public Truck(String vin, String brand, String model, LocalDate manufacturingDate,
            Origin origin, int kms, Condition condition, int price,
            double length, double load, TruckType truckType) {
        this(vin, brand, model, manufacturingDate, origin, kms, condition, price,
                length, load, truckType, null);
    }

    
    public Truck(String vin, String brand, String model, LocalDate manufacturingDate,
            Origin origin, int kms, Condition condition, int price,
            double length, double load, TruckType truckType, Trailer trailer) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.length = length;
        this.load = load;
        this.truckType = truckType;
        this.trailer = trailer;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    @Override
    public int getPrice() {
        boolean isNew = getCondition() == Condition.NEW;
        if (trailer != null && isNew) {
            return super.getPrice() * 95 / 100;
        }
        if (trailer == null && isNew) {
            return super.getPrice();
        }
        return super.getPrice() * 85 / 100;
    }

    @Override
    public String toString() {
        return "Truck -> " + super.toString()
                + ", Length: " + length
                + ", Load: " + load
                + ", Type: " + truckType
                + ", Trailer: " + (trailer == null ? "none" : "[" + trailer + "]");
    }
}
