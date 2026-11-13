package pt.ipp.estg.pp.pp_fp08.stand.trailer;

/**
 *
 * @author luism
 */
public class SemiTrailer extends Trailer {

    private int spareTyreNumber;

    public SemiTrailer(double load, int spareTyreNumber) {
        super(load);
        this.spareTyreNumber = spareTyreNumber;
    }

    public SemiTrailer(int axesNumber, double load, int spareTyreNumber) {
        super(axesNumber, load);
        this.spareTyreNumber = spareTyreNumber;
    }

    public int getSpareTyreNumber() {
        return spareTyreNumber;
    }

    public void setSpareTyreNumber(int spareTyreNumber) {
        this.spareTyreNumber = spareTyreNumber;
    }

    @Override
    public String toString() {
        return "SemiTrailer -> " + super.toString() + ", Spare tyres: " + spareTyreNumber;
    }
}
