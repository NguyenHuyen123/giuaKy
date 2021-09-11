package review2;

public class Circle implements Rectangular{
    private  double topleft;
    private double cR;

    public Circle(double topleft, double cR) {
        this.topleft = topleft;
        this.cR = cR;
    }

    public double getcR() {
        return cR;
    }

    @Override
    public double area() {
        return Math.pow(getcR(),2);
    }

    @Override
    public String toString() {
        return "Circle: " + ", cR=" +this.cR +" S= "+area()+ " mét vuông"+"\n";
    }
}
