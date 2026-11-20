package pt.ipp.estg.pp.pp_fp09.enums;

/**
 *
 * @author luism
 */
public enum Qualification {
    BACHELOR(0.10),
    MASTER(0.20),
    DOCTORATE(0.30);

    private final double bonus;

    Qualification(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
