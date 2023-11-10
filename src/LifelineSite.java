public class LifelineSite extends Site{


     @Override
     double getTaxAmount() {
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;
    }

     @Override
     double getBaseAmount() {
        double base = _units * _rate * 0.5;
        return base;
    }
}
