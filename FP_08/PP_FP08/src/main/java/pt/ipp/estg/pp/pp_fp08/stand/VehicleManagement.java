package pt.ipp.estg.pp.pp_fp08.stand;

/**
 *
 * @author luism
 */
public class VehicleManagement {

    private static final int INITIAL_CAPACITY = 10;

    private Vehicle[] vehicles;
    private int count;

    public VehicleManagement() {
        this.vehicles = new Vehicle[INITIAL_CAPACITY];
        this.count = 0;
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (vehicle == null || existsVehicle(vehicle)) {
            return false;
        }
        if (count == vehicles.length) {
            growArray();
        }
        vehicles[count] = vehicle;
        count++;
        return true;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        int index = findIndex(vehicle);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < count - 1; i++) {
            vehicles[i] = vehicles[i + 1];
        }
        count--;
        vehicles[count] = null;
        return true;
    }

    public Vehicle getVehicleByVin(String vin) {
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getVin() != null && vehicles[i].getVin().equals(vin)) {
                return vehicles[i];
            }
        }
        return null;
    }

    public boolean existsVehicle(Vehicle vehicle) {
        return findIndex(vehicle) != -1;
    }

    public int getNumberOfVehicles() {
        return count;
    }

    public String countVehicles() {
        int cars = 0;
        int bikes = 0;
        int trucks = 0;
        for (int i = 0; i < count; i++) {
            if (vehicles[i] instanceof Car) {
                cars++;
            } else if (vehicles[i] instanceof Bike) {
                bikes++;
            } else if (vehicles[i] instanceof Truck) {
                trucks++;
            }
        }
        int others = count - cars - bikes - trucks;
        return "Total: " + count
                + " | Cars: " + cars
                + " | Bikes: " + bikes
                + " | Trucks: " + trucks
                + " | Others: " + others;
    }

    public void listVehicles() {
        for (int i = 0; i < count; i++) {
            System.out.println(vehicles[i]);
        }
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicles available: ").append(count).append("\n");
        for (int i = 0; i < count; i++) {
            sb.append(vehicles[i]).append("\n");
        }
        return sb.toString();
    }

    private int findIndex(Vehicle vehicle) {
        for (int i = 0; i < count; i++) {
            if (vehicles[i].equals(vehicle)) {
                return i;
            }
        }
        return -1;
    }

    private void growArray() {
        Vehicle[] bigger = new Vehicle[vehicles.length * 2];
        for (int i = 0; i < count; i++) {
            bigger[i] = vehicles[i];
        }
        vehicles = bigger;
    }
}
