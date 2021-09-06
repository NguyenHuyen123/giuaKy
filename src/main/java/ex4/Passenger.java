package ex4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Passenger {
    private String hoten;
    private boolean gioiTinh;
    private int tuoi;
    private Ticket[] danhSachVe;


    public Passenger(String hoten, boolean gioiTinh, int tuoi, Ticket[] danhSachVe) {
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.danhSachVe = danhSachVe;
    }

    public Passenger() {

    }

    @Override
    public String toString() {
        String s = "";
        for (Ticket i : danhSachVe) {
            s += i.toString() + "\n";
        }
        return "Passenger: " + "hoten: '" + hoten + '\'' +
                ", gioiTinh: " + gioiTinh +
                ", tuoi: " + tuoi +
                ", danhSachVe:" + "\n" + s;

    }

    public int tinhTongTien() {
        int result = 0;
        for (Ticket i : this.danhSachVe) {
            result += i.getGiaVe();
        }
        return result;
    }

    public void sortDESCdanhsach() {
        Ticket temp = this.danhSachVe[0];
        for (int i = 0; i < this.danhSachVe.length - 1; i++) {
            for (int j = i + 1; j < this.danhSachVe.length; j++) {
                if (this.danhSachVe[i].getGiaVe() < this.danhSachVe[j].getGiaVe()) {
                    temp = this.danhSachVe[j];
                    this.danhSachVe[j] = this.danhSachVe[i];
                    this.danhSachVe[i] = temp;
                }
            }
        }
    }

    public static Passenger[] sortDESCPassenger(Passenger[] arrPassenger) {
        Passenger temp = arrPassenger[0];
        for (int i = 0; i < arrPassenger.length - 1; i++) {
            for (int j = i + 1; j < arrPassenger.length; j++) {
                if (arrPassenger[i].tinhTongTien() < arrPassenger[j].tinhTongTien()) {
                    temp = arrPassenger[j];
                    arrPassenger[j] = arrPassenger[i];
                    arrPassenger[i] = temp;
                }
            }
        }
        return arrPassenger;
    }

}
