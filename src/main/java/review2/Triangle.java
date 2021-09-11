package review2;

import review2.IShape;

public class Triangle implements IShape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public boolean isTriang() {
        if (this.a + this.b > this.c || this.a + this.c > this.b || this.b + this.c > this.a) {
            return true;

        } else
            return false;
    }

    public double chuVi() {
        int result = 0;
        if (isTriang() == true)
            result += getA() + getB() + getC();
        return result;
    }


    @Override
    public double area() {
        double dt;
        double p = chuVi() / 2;
        dt = Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
        return dt;
    }

    @Override
    public String toString() {
        return "Triangle: " + "a=" + this.a + ", b=" + this.b + ", c=" + this.c + " S= " + area() + " mét vuông" + "\n";
    }
}
