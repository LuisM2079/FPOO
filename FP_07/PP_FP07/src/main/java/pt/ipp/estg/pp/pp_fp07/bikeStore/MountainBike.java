package pt.ipp.estg.pp.pp_fp07.bikeStore;

import pt.ipp.estg.pp.pp_fp07.enumerations.BikeTools;
import pt.ipp.estg.pp.pp_fp07.enumerations.Brakes_Type;
import pt.ipp.estg.pp.pp_fp07.enumerations.Material_Type;
import pt.ipp.estg.pp.pp_fp07.enumerations.Suspension_Type;

/**
 *
 * @author luism
 */

public class MountainBike extends Bicycle {
    private static final int MAX_TOOLS = 5;

    private int numberOfLigths;
    private Suspension_Type suspension;
    private BikeTools[] bikeTools;
    private int numberOfTools;

    public MountainBike(int id, int numberOfGears, String mainColor, double wheelSize,
                        Brakes_Type brakes, Material_Type material, double price, int warranty,
                        int numberOfLigths, Suspension_Type suspension) {
        super(id, numberOfGears, mainColor, wheelSize, brakes, material, price, warranty);
        this.numberOfLigths = numberOfLigths;
        this.suspension = suspension;
        this.bikeTools = new BikeTools[MAX_TOOLS];
        this.numberOfTools = 0;
    }

    public int getNumberOfLigths() { return numberOfLigths; }
    public void setNumberOfLigths(int numberOfLigths) { this.numberOfLigths = numberOfLigths; }
    public Suspension_Type getSuspension() { return suspension; }
    public void setSuspension(Suspension_Type suspension) { this.suspension = suspension; }
    public int getNumberOfTools() { return numberOfTools; }

    private int findBikeTool(BikeTools tool) {
        for (int i = 0; i < numberOfTools; i++) {
            if (bikeTools[i] == tool) {
                return i;
            }
        }
        return -1;
    }

    public boolean addBikeTool(BikeTools tool) {
        if (tool == null || numberOfTools >= MAX_TOOLS || findBikeTool(tool) != -1) {
            return false;
        }
        bikeTools[numberOfTools] = tool;
        numberOfTools++;
        return true;
    }

    public boolean removeBikeTool(BikeTools tool) {
        int index = findBikeTool(tool);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < numberOfTools - 1; i++) {
            bikeTools[i] = bikeTools[i + 1];
        }
        bikeTools[numberOfTools - 1] = null;
        numberOfTools--;
        return true;
    }

    public boolean editBikeTool(BikeTools oldTool, BikeTools newTool) {
        int index = findBikeTool(oldTool);
        if (index == -1 || newTool == null) {
            return false;
        }
        if (oldTool != newTool && findBikeTool(newTool) != -1) {
            return false;
        }
        bikeTools[index] = newTool;
        return true;
    }

    public void listBikeTools() {
        for (int i = 0; i < numberOfTools; i++) {
            System.out.println(bikeTools[i]);
        }
    }

    @Override
    public String toString() {
        String tools = "";
        for (int i = 0; i < numberOfTools; i++) {
            tools += bikeTools[i] + (i < numberOfTools - 1 ? ", " : "");
        }
        return "Montanha " + super.toString() + " [luzes=" + numberOfLigths
                + ", suspensao=" + suspension + ", utensilios={" + tools + "}]";
    }
}