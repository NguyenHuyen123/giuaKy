package Ex5_KeThua;

import java.util.ArrayList;
import java.util.List;

public class Center {
    public static void main(String[] args) {
        Lecturer vlt1 = new VisitLec("Nguyen Van A", "h@gmail.com", "HCM", "0987627839", 20, "Trung tâm Anh Ngữ");
        Lecturer vlt2 = new VisitLec("Nguyen Van B", "a@gmail.com", "HCM", "0987563839", 5, "Trung tâm Anh Ngữ");
        Lecturer vlt3 = new VisitLec("Nguyen Van C", "s@gmail.com", "HCM", "0956277839", 7, "Trung tâm Anh Ngữ");
        Lecturer vlt4 = new VisitLec("Nguyen Van D", "d@gmail.com", "HCM", "0234627839", 15, "Trung tâm Anh Ngữ");

        Lecturer olt1 = new OrganicLec("Trần Quốc Đạo", "a@gmail.co", "HCM", "0983283919", 47, 5650000, 250000);
        Lecturer olt2 = new OrganicLec("Trần Quốc B", "a@gmail.co", "HCM", "0983283919", 80, 5650000, 250000);
        Lecturer olt3 = new OrganicLec("Trần Quốc C", "a@gmail.co", "HCM", "0983283919", 43, 5650000, 220000);
        Lecturer olt4 = new OrganicLec("Trần Quốc D", "a@gmail.co", "HCM", "0983283919", 12, 5650000, 210000);
        List<Lecturer> ar1 = new ArrayList<>();
        ar1.add(vlt1);
        ar1.add(vlt2);
        ar1.add(vlt3);
        ar1.add(vlt4);
        ar1.add(olt1);
        ar1.add(olt2);
        ar1.add(olt3);
        ar1.add(olt4);
        for (Lecturer lt : ar1) {
            System.out.println(lt.toString());
        }
        // in ra Tổng lương cao nhất của giáo viên
        Lecturer max = ar1.get(0);
        for (Lecturer lt : ar1) {
            if (max.salary() < lt.salary())
                max = lt;

        }

        System.out.println("**Giảng viên có lương cao nhất ");
        System.out.println(max);

        // Thuộc giáo viên nào
        if (max.isTypeLecs()) {
            System.out.println("Là giáo viên cơ hữu");

        } else
            System.out.println("Là giáo viên thỉnh giảng");

    }
}
