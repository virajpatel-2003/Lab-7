public class ResidentialSite extends Site {
    double _units, _rate;
    double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
