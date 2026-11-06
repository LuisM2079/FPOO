package pt.ipp.estg.pp.pp_fp07.bikeStore;

import pt.ipp.estg.pp.pp_fp07.enumerations.BikeTools;
import pt.ipp.estg.pp.pp_fp07.enumerations.Brakes_Type;
import pt.ipp.estg.pp.pp_fp07.enumerations.Material_Type;
import pt.ipp.estg.pp.pp_fp07.enumerations.Suspension_Type;

/**
 *
 * @author luism
 */

public class BikeDemo {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(1, 21, "Vermelho", 27.5,
                Brakes_Type.PINCAS, Material_Type.ALUMINIO, 850.0, 2,
                2, Suspension_Type.DUPLA);

        mb.addBikeTool(BikeTools.GARRAFA_AGUA);
        mb.addBikeTool(BikeTools.ALFORJE);
        System.out.println("Utensílio duplicado adicionado? " + mb.addBikeTool(BikeTools.ALFORJE));
        System.out.println("Utensílios da bicicleta de montanha:");
        mb.listBikeTools();

        mb.editBikeTool(BikeTools.ALFORJE, BikeTools.SUPORTE_TELEMOVEL);
        mb.removeBikeTool(BikeTools.GARRAFA_AGUA);
        System.out.println("Depois de editar e remover:");
        mb.listBikeTools();

        RoadBike rb = new RoadBike(2, 18, "Preto", 28.0, 1500.0, 3,
                "Fita preta", 54,
                "Quero o quadro com acabamento mate e detalhes em dourado");

        System.out.println("Material: " + rb.getMaterial());
        System.out.println("Travões: " + rb.getBrakes());
        System.out.println("Observações: " + rb.getObservations());
    }
}
