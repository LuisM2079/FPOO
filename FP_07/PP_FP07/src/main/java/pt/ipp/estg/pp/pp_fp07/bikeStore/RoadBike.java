package pt.ipp.estg.pp.pp_fp07.bikeStore;

import pt.ipp.estg.pp.pp_fp07.enumerations.Brakes_Type;
import pt.ipp.estg.pp.pp_fp07.enumerations.Material_Type;

/**
 *
 * @author luism
 */

public class RoadBike extends Bicycle {
    private static final int MAX_OBSERVATIONS = 50;

    private String handlebelt;
    private int frameSize;
    private String observations;

    public RoadBike(int id, int numberOfGears, String mainColor, double wheelSize,
                    double price, int warranty,
                    String handlebelt, int frameSize, String observations) {
        super(id, numberOfGears, mainColor, wheelSize,
              Brakes_Type.HIDRAULICOS, Material_Type.CARBONO, price, warranty);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        setObservations(observations);
    }

    public String getHandlebelt() { return handlebelt; }
    public void setHandlebelt(String handlebelt) { this.handlebelt = handlebelt; }
    public int getFrameSize() { return frameSize; }
    public void setFrameSize(int frameSize) { this.frameSize = frameSize; }
    public String getObservations() { return observations; }

    public void setObservations(String observations) {
        if (observations != null && observations.length() > MAX_OBSERVATIONS) {
            this.observations = observations.substring(0, MAX_OBSERVATIONS);
        } else {
            this.observations = observations;
        }
    }

    @Override
    public String toString() {
        return "Estrada " + super.toString() + " [fitas=" + handlebelt
                + ", quadro=" + frameSize + ", observacoes=" + observations + "]";
    }
}
