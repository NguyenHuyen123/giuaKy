package review2;

public class Square implements  IShape{
    private double topleft;
    private double cD;
    private double cR;

    public Square(double topleft, double cD, double cR) {
        this.topleft = topleft;
        this.cD = cD;
        this.cR = cR;
    }

    public double getcD() {
        return cD;
    }

    public double getcR() {
        return cR;
    }

    @Override
    public double area() {
        return getcR()*getcD();
    }

    @Override
    public String toString() {
        return "Square: " + ", cD=" + this.cD + ", cR=" + this.cR + " S= "+area()+ " mét vuông"+"\n";
    }
}
