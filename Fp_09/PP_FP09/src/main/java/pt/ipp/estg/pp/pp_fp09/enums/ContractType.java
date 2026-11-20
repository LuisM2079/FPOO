package pt.ipp.estg.pp.pp_fp09.enums;

/**
 *
 * @author luism
 */
public enum ContractType {
    PARTIAL(0.5),
    INTEGRAL(1.0);

    private final double percentage;

    ContractType(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }
}
