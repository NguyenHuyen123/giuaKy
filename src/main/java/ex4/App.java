package ex4;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("ABC", new Date(1 / 2 / 2021), 1200000);
        Ticket t2 = new Ticket("ABC", new Date(1 / 2 / 2021), 100000);
        Ticket t3 = new Ticket("ABCD", new Date(7 / 2 / 2021), 2000000);
        Ticket t4 = new Ticket("ABCD", new Date(7 / 2 / 2021), 700000);
        Ticket[] arrTicket1 = new Ticket[2];
        arrTicket1[0] = t1;
        arrTicket1[1] = t2;

        Passenger p1 = new Passenger("Nguyen Van 1", true, 12, arrTicket1);
        p1.sortDESCdanhsach();


        Ticket[] arrTicket2 = new Ticket[2];
        arrTicket2[0] = t3;
        arrTicket2[1] = t4;
        Passenger p2 = new Passenger("Nguyen Van 2", false, 17, arrTicket2);
        p2.sortDESCdanhsach();

        System.out.println("----------------------------------------------------");
        Passenger[] arrPassenger = new Passenger[2];
        arrPassenger[0] = p2;
        arrPassenger[1] = p1;
        for (Passenger p : Passenger.sortDESCPassenger(arrPassenger)
        ) {
            System.out.println(p.toString());
            System.out.println("Tổng tiền : " + p.tinhTongTien());
        }
        ;
    }
}
