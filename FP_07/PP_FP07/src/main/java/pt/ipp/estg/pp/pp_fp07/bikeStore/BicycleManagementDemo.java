package pt.ipp.estg.pp.pp_fp07.bikeStore;

import pt.ipp.estg.pp.pp_fp07.enumerations.BikeTools;
import pt.ipp.estg.pp.pp_fp07.enumerations.Brakes_Type;
import pt.ipp.estg.pp.pp_fp07.enumerations.Material_Type;
import pt.ipp.estg.pp.pp_fp07.enumerations.Suspension_Type;

/**
 *
 * @author luism
 */

public class BicycleManagementDemo {
    public static void main(String[] args) {
        BicycleManagement management = new BicycleManagement(5);

        String[] colors = {"Vermelho", "Azul", "Preto", "Verde", "Branco"};
        Suspension_Type[] suspensions = Suspension_Type.values();
        Brakes_Type[] brakes = Brakes_Type.values();
        Material_Type[] materials = Material_Type.values();
        BikeTools[] tools = BikeTools.values();

        for (int i = 1; i <= 12; i++) {
            MountainBike mb = new MountainBike(i, 18 + i, colors[i % colors.length], 26 + (i % 3),
                    brakes[i % brakes.length], materials[i % materials.length],
                    500.0 + i * 50, 2,
                    i % 4, suspensions[i % suspensions.length]);
            mb.addBikeTool(tools[i % tools.length]);
            mb.addBikeTool(tools[(i + 1) % tools.length]);
            management.addBicycle(mb);
        }

        for (int i = 13; i <= 22; i++) {
            RoadBike rb = new RoadBike(i, 16 + (i % 6), colors[i % colors.length], 28.0,
                    1000.0 + i * 40, 3,
                    "Fita " + colors[(i + 1) % colors.length], 50 + (i % 8),
                    "Pedido especial numero " + i + " do cliente da loja de bicicletas");
            management.addBicycle(rb);
        }

        System.out.println("Total de bicicletas: " + management.getNumberOfBicycles());
        System.out.println("\n--- Todas as bicicletas ---");
        management.listBicycles();

        System.out.println("\n--- Apenas bicicletas de montanha ---");
        management.listMountainBikes();

        System.out.println("\nRemover id 5: " + management.removeBicycle(5));
        System.out.println("Remover id 99 (não existe): " + management.removeBicycle(99));
        System.out.println("Total de bicicletas: " + management.getNumberOfBicycles());
    }
}
