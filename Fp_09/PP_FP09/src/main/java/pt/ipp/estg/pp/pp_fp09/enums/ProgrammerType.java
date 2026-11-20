package pt.ipp.estg.pp.pp_fp09.enums;

/**
 *
 * @author luism
 */
public enum ProgrammerType {
    JUNIOR(0.05),
    SENIOR(0.15);

    private final double bonus;

    ProgrammerType(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
