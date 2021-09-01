package ex4;

import java.util.Date;
import java.util.ArrayList;

public class Ticket {
    private String tenChuyen;
    private Date ngayBay;
    private int giaVe;

    public Ticket(String tenChuyen, Date ngayBay, int giaVe) {
        this.tenChuyen = tenChuyen;
        this.ngayBay = ngayBay;
        this.giaVe = giaVe;
    }

    public Ticket() {

    }

    public int getGiaVe() {
        return giaVe;
    }

    @Override
    public String toString() {
        return "Ticket: " + "tenChuyen:'" + tenChuyen  + ", ngayBay: " + ngayBay + ", giaVe: " + giaVe;
    }


}
