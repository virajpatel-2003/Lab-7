public class LifelineSite extends Site{
        double getBillableAmount() {
            double base = getBaseAmount();
            double tax = getTaxAmount();
            return base + tax;
    }

     double getTaxAmount() {
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;
    }

     double getBaseAmount() {
        double base = _units * _rate * 0.5;
        return base;
    }
}
