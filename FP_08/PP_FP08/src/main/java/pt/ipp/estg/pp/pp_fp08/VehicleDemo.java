package pt.ipp.estg.pp.pp_fp08;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp08.stand.Bike;
import pt.ipp.estg.pp.pp_fp08.stand.Car;
import pt.ipp.estg.pp.pp_fp08.stand.Truck;
import pt.ipp.estg.pp.pp_fp08.stand.Vehicle;
import pt.ipp.estg.pp.pp_fp08.stand.VehicleManagement;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Condition;
import pt.ipp.estg.pp.pp_fp08.stand.enums.Origin;
import pt.ipp.estg.pp.pp_fp08.stand.enums.TrailerType;
import pt.ipp.estg.pp.pp_fp08.stand.enums.TruckType;
import pt.ipp.estg.pp.pp_fp08.stand.trailer.SemiTrailer;
import pt.ipp.estg.pp.pp_fp08.stand.trailer.TowHaul;

/**
 *
 * @author luism
 */
public class VehicleDemo {

    
    public static void main(String[] args) {
        Car newCar = new Car("VIN001", "Toyota", "Yaris", LocalDate.of(2024, 3, 15),
                Origin.IMPORTED, 0, Condition.NEW, 20000, 5, 5);
        Car usedCar = new Car("VIN002", "Renault", "Clio", LocalDate.of(2019, 6, 10),
                Origin.NATIONAL, 85000, Condition.USED, 10000, 5);

        Bike bike = new Bike("VIN003", "Yamaha", "MT-07", LocalDate.of(2022, 5, 20),
                Origin.IMPORTED, 12000, Condition.USED, 7500, 689, 17);

        TowHaul towHaul = new TowHaul(8000.0, TrailerType.CLOSED);
        SemiTrailer semiTrailer = new SemiTrailer(3, 24000.0, 2);

        Truck truckNewWithTrailer = new Truck("VIN004", "Volvo", "FH", LocalDate.of(2025, 1, 10),
                Origin.IMPORTED, 0, Condition.NEW, 100000, 16.5, 18000.0, TruckType.TIR, semiTrailer);
        Truck truckNewNoTrailer = new Truck("VIN005", "MAN", "TGX", LocalDate.of(2025, 2, 5),
                Origin.IMPORTED, 0, Condition.NEW, 90000, 7.5, 9000.0, TruckType.TRUCK);
        Truck truckUsedWithTrailer = new Truck("VIN006", "Scania", "R450", LocalDate.of(2018, 9, 1),
                Origin.NATIONAL, 450000, Condition.USED, 60000, 12.0, 14000.0, TruckType.TRUCK, towHaul);

        Vehicle[] demo = {newCar, usedCar, bike, truckNewWithTrailer, truckNewNoTrailer, truckUsedWithTrailer};

        System.out.println("=== Vehicles and prices ===");
        for (int i = 0; i < demo.length; i++) {
            System.out.println(demo[i]);
        }

        System.out.println();
        System.out.println("=== Vehicle management ===");
        VehicleManagement management = new VehicleManagement();
        for (int i = 0; i < demo.length; i++) {
            management.addVehicle(demo[i]);
        }

        Car duplicate = new Car("VIN001", "Fiat", "500", LocalDate.of(2023, 7, 1),
                Origin.IMPORTED, 5000, Condition.USED, 12000, 4, 3);
        System.out.println("Add vehicle with repeated VIN: " + management.addVehicle(duplicate));
        System.out.println("Exists usedCar? " + management.existsVehicle(usedCar));
        System.out.println("Exists duplicate (same VIN)? " + management.existsVehicle(duplicate));
        System.out.println(management.countVehicles());

        Vehicle found = management.getVehicleByVin("VIN003");
        if (found != null) {
            found.setKms(13000);
            System.out.println("Edited VIN003 kms: " + found.getKms());
        }

        System.out.println("Remove usedCar: " + management.removeVehicle(usedCar));
        System.out.println("Remove usedCar again: " + management.removeVehicle(usedCar));
        System.out.println(management.countVehicles());

        System.out.println();
        management.printInfo();
    }
}
