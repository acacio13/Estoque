package core.model;
/**
 * 
 * @author AcacioSouza
 */
public class Nota {

	
    private long _10;
    private long _20;
    private long _50;
    private long _100;

    public Nota() {
        this( 0, 0, 0, 0);
    }

    public Nota( long _10, long _20, long _50, long _100) {
     
        this._10 = _10;
        this._20 = _20;
        this._50 = _50;
        this._100 = _100;
    }

   

    public void add_10(long _10) {
        this._10 += _10;
    }

    public long get_10() {
        return _10;
    }

    public void set_10(long _10) {
        this._10 = _10;
    }

    public void add_20(long _20) {
        this._20 += _20;
    }

    public long get_20() {
        return _20;
    }

    public void set_20(long _20) {
        this._20 = _20;
    }

    public void add_50(long _50) {
        this._50 += _50;
    }

    public long get_50() {
        return _50;
    }

    public void set_50(long _50) {
        this._50 = _50;
    }

    public void add_100(long _100) {
        this._100 += _100;
    }

    public long get_100() {
        return _100;
    }

    public void set_100(long _100) {
        this._100 = _100;
    }
}