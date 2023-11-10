public class ResidentialSite extends Site {
    double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    private double getTaxAmount() {
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE;
        return tax;
    }

    private double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }
}
