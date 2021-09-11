package review2;

import java.util.ArrayList;
import java.util.List;

public class RealEstate {
    public static void main(String[] args) {
        double price=500000.0 ;
        Square s = new Square(2.0, 7.0, 6.2);
        Circle c = new Circle(3.0, 7.3);
        Geometry g = new Geometry(0.0, 6.0);
        Triangle t = new Triangle(8, 5, 8);
        List<Rectangular> list = new ArrayList<>();
        list.add(s);
        list.add(c);
        list.add(g);
        list.add(t);
        int total = 0;
        for (Rectangular r : list) {
            System.out.println(r);
            total += price*r.area();
        }
        System.out.println("Tổng tiền phải chi trả sở hữu các mảnh đất: " + total+ " VNĐ");

    }
}
