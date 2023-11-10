public class ResidentialSite extends Site {
    double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    private static double getTaxAmount(double base) {
        double tax = base * Site.TAX_RATE;
        return tax;
    }

    private double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }
}
