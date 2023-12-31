public abstract class Site {
    protected int _units;
    protected double _rate;
    public static final double TAX_RATE = 0.2;

    public Site(int units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    protected abstract double getTaxAmount();

    protected abstract double getBaseAmount();
}
