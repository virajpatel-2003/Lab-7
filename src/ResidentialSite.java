public class ResidentialSite extends Site {

    @Override
    double getTaxAmount() {
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE;
        return tax;
    }

     @Override
     double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }
}
