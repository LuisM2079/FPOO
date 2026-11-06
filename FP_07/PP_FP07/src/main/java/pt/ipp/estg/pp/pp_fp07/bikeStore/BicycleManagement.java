package pt.ipp.estg.pp.pp_fp07.bikeStore;

/**
 *
 * @author luism
 */

public class BicycleManagement {
    private static final int DEFAULT_CAPACITY = 10;

    private Bicycle[] bicycles;
    private int numberOfBicycles;

    public BicycleManagement() {
        this(DEFAULT_CAPACITY);
    }

    public BicycleManagement(int initialCapacity) {
        if (initialCapacity < 1) {
            initialCapacity = DEFAULT_CAPACITY;
        }
        this.bicycles = new Bicycle[initialCapacity];
        this.numberOfBicycles = 0;
    }

    public int getNumberOfBicycles() { return numberOfBicycles; }

    private void growArray() {
        Bicycle[] bigger = new Bicycle[bicycles.length * 2];
        for (int i = 0; i < numberOfBicycles; i++) {
            bigger[i] = bicycles[i];
        }
        bicycles = bigger;
    }

    private int findBicycle(int id) {
        for (int i = 0; i < numberOfBicycles; i++) {
            if (bicycles[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean addBicycle(Bicycle bicycle) {
        if (bicycle == null || findBicycle(bicycle.getId()) != -1) {
            return false;
        }
        if (numberOfBicycles == bicycles.length) {
            growArray();
        }
        bicycles[numberOfBicycles] = bicycle;
        numberOfBicycles++;
        return true;
    }

    public boolean removeBicycle(int id) {
        int index = findBicycle(id);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < numberOfBicycles - 1; i++) {
            bicycles[i] = bicycles[i + 1];
        }
        bicycles[numberOfBicycles - 1] = null;
        numberOfBicycles--;
        return true;
    }

    public void listBicycles() {
        for (int i = 0; i < numberOfBicycles; i++) {
            System.out.println(bicycles[i]);
        }
    }

    public void listMountainBikes() {
        for (int i = 0; i < numberOfBicycles; i++) {
            if (bicycles[i] instanceof MountainBike) {
                System.out.println(bicycles[i]);
            }
        }
    }
}
