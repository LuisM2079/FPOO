package pt.ipp.estg.pp.pp_fp08.stand.trailer;

/**
 *
 * @author luism
 */
public class Trailer {

    public static final int DEFAULT_AXES_NUMBER = 2;

    private int axesNumber;
    private double load;

    public Trailer(double load) {
        this(DEFAULT_AXES_NUMBER, load);
    }

    public Trailer(int axesNumber, double load) {
        this.axesNumber = axesNumber;
        this.load = load;
    }

    public int getAxesNumber() {
        return axesNumber;
    }

    public void setAxesNumber(int axesNumber) {
        this.axesNumber = axesNumber;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Axes: " + axesNumber + ", Load: " + load;
    }
}
