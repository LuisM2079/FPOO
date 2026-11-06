package pt.ipp.estg.pp.pp_fp07.bikeStore;

import pt.ipp.estg.pp.pp_fp07.enumerations.Brakes_Type;
import pt.ipp.estg.pp.pp_fp07.enumerations.Material_Type;

/**
 *
 * @author luism
 */

public class Bicycle {
    private int id;
    private int numberOfGears;
    private String mainColor;
    private double wheelSize;
    private Brakes_Type brakes;
    private Material_Type material;
    private double price;
    private int warranty;

    public Bicycle(int id, int numberOfGears, String mainColor, double wheelSize,
                   Brakes_Type brakes, Material_Type material, double price, int warranty) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.warranty = warranty;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getNumberOfGears() { return numberOfGears; }
    public void setNumberOfGears(int numberOfGears) { this.numberOfGears = numberOfGears; }
    public String getMainColor() { return mainColor; }
    public void setMainColor(String mainColor) { this.mainColor = mainColor; }
    public double getWheelSize() { return wheelSize; }
    public void setWheelSize(double wheelSize) { this.wheelSize = wheelSize; }
    public Brakes_Type getBrakes() { return brakes; }
    public void setBrakes(Brakes_Type brakes) { this.brakes = brakes; }
    public Material_Type getMaterial() { return material; }
    public void setMaterial(Material_Type material) { this.material = material; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getWarranty() { return warranty; }
    public void setWarranty(int warranty) { this.warranty = warranty; }

    @Override
    public String toString() {
        return "Bicicleta [id=" + id + ", velocidades=" + numberOfGears
                + ", cor=" + mainColor + ", roda=" + wheelSize
                + ", travoes=" + brakes + ", material=" + material
                + ", preco=" + price + ", garantia=" + warranty + " anos]";
    }
}