package pt.ipp.estg.pp.pp_fp08.stand.trailer;

import pt.ipp.estg.pp.pp_fp08.stand.enums.TrailerType;

/**
 *
 * @author luism
 */
public class TowHaul extends Trailer {

    private TrailerType trailerType;

    public TowHaul(double load, TrailerType trailerType) {
        super(load);
        this.trailerType = trailerType;
    }

    public TowHaul(int axesNumber, double load, TrailerType trailerType) {
        super(axesNumber, load);
        this.trailerType = trailerType;
    }

    public TrailerType getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(TrailerType trailerType) {
        this.trailerType = trailerType;
    }

    @Override
    public String toString() {
        return "TowHaul -> " + super.toString() + ", Type: " + trailerType;
    }
}
