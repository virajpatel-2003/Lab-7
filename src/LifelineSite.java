public class LifelineSite extends Site{
        double getBillableAmount() {
            double base = getBaseAmount();
            double tax = getTaxAmount(base);
            return base + tax;
    }

    private static double getTaxAmount(double base) {
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;
    }

    private double getBaseAmount() {
        double base = _units * _rate * 0.5;
        return base;
    }
}
