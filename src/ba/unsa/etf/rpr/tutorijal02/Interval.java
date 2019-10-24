package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double x;
    private double y;
    private boolean prvaGranica;
    private boolean drugaGranica;


    public static Interval intersect(Interval i, Interval i2) {
    return i;
    }

    public Interval(double x,double y,boolean prva,boolean druga) throws IllegalArgumentException {
        if(x>y) {
            throw new IllegalArgumentException ("Prva granica veca od druge");
        }
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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isPrvaGranica() {
        return prvaGranica;
    }

    public boolean isDrugaGranica() {
        return drugaGranica;
    }

    public boolean isIn(double v) {
        if(v<x || v>y) return false;
        if(!isPrvaGranica() && v==x) return false;
        if(!isDrugaGranica() && v==y) return false;
        return true;
     }

    public boolean isNull() {
        if(x!=0 || y!=0 || isPrvaGranica() || isDrugaGranica()) return false;
        return true;
    }

    public Interval intersect(Interval interval) {

        if(x==interval.x && isPrvaGranica() && interval.isPrvaGranica()) {
            if(y<interval.y ) return this;
            else if(y>interval.y) {
                if(interval.isDrugaGranica())5 {
                    return new Interval(x,y,true,);
                }

            }
        }
        if()
    }
}
