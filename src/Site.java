public abstract class Site {
    static double TAX_RATE;
    double _units;
    double _rate;

    double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    abstract double getTaxAmount();

    abstract double getBaseAmount();
}
