package Ex5_KeThua;

import java.util.List;

public abstract class Lecturer {
    private String nameLec;
    private String email;
    private String address;
    private String phone;
    private int hourOfMonth;

    public Lecturer(String nameLec, String email, String address, String phone, int hourOfMonth) {
        this.nameLec = nameLec;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.hourOfMonth = hourOfMonth;
    }

    public String getNameLec() {
        return nameLec;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getHourOfMonth() {
        return hourOfMonth;
    }

    public abstract int salary();

    public boolean  isTypeLec() {
        if (getHourOfMonth() > 40) {
            return true; // là giáo viên cơ hữu
        } else
            return false; // là giáo viên thỉnh giảng
    }

    @Override
    public String toString() {
        return "Lecturer" + "nameLec='" + getNameLec() + ", email='" + getEmail() + ", address='" + getAddress() + ", phone=" + getPhone() + ", agreeSalary=" + getHourOfMonth();
    }
}
