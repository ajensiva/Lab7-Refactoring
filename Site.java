public abstract class Site {
    protected int _units;
    protected double _rate;
    public static final double TAX_RATE = 0.2;

    public Site(int _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }
}