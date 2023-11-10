public abstract class Site {
    static double TAX_RATE;
    double _units;
    double _rate;

    double getBillableAmount() {
        double tax = getTaxAmount();
        return getBaseAmount() + tax;
    }

    abstract double getTaxAmount();

    abstract double getBaseAmount();
}
