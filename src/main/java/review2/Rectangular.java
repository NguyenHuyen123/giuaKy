package review2;

public class Rectangular implements IShape {
    private double heartO;
    private double radius;

    public Rectangular(double heartO, double radius) {
        this.heartO = heartO;
        this.radius = radius;
    }

    public double getHeartO() {
        return heartO;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(getRadius(), 2) * 3.14;
    }

    @Override
    public String toString() {
        return "Geometry: " + "heartO=" + this.heartO + ", radius=" + this.radius + " S= " + area() + " mét vuông" + "\n";
    }
}
