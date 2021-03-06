package review2;

public class Square implements IShape{
    private double topleft;
    private double cR ;

    public Square(double topleft, double cR) {
        this.topleft = topleft;
        this.cR = cR;
    }

    public double getcR() {
        return cR ;
    }

    @Override
    public double area() {
        return Math.pow(getcR(), 2);
    }

    @Override
    public String toString() {
        return "Square: " + ", cR=" + this.cR + " S= " + area() + " mét vuông" + "\n";
    }
}
