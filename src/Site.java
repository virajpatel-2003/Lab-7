public abstract class Site {
    static double TAX_RATE;
    double _units;
    double _rate;

    double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    abstract double getTaxAmount();

    abstract double getBaseAmount();
}
