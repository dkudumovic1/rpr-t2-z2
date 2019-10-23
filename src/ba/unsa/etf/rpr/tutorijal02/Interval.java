package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double x;
    private double y;
    private boolean prvaGranica;
    private boolean drugaGranica;


    public static Interval intersect(Interval i, Interval i2) {
    }

    public Interval(double x,double y,boolean prva,boolean druga) {
        if(x>y) throw IllegalArgumentException;
        this.x = x;
        this.y = y;
        prvaGranica=prva;
        drugaGranica=druga;

    }

    public Interval() {
        this.x=0;
        this.y=0;
        prvaGranica=false;
        drugaGranica=false;
    }

    public boolean isIn(double v) {

    }

    public boolean isNull() {
        if(x!=0 || y!=0 || prvaGranica || drugaGranica) return false;
        return true;
    }
}
