public class ResidentialSite extends Site{

    public ResidentialSite(int _units, double _rate) {
        super(_units, _rate);
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    @Override
    protected double getTaxAmount(){
        return this.getBaseAmount() * Site.TAX_RATE;
    }
    
}
