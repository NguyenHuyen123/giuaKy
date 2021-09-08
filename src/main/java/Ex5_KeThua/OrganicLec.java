package Ex5_KeThua;

public class OrganicLec extends Lecturer {
    private int price1Month;
    private int salary1Hour;

    public OrganicLec(String nameLec, String email, String address, String phone, int hourOfMonth, int price1Month, int salary1Hour) {
        super(nameLec, email, address, phone, hourOfMonth);
        this.price1Month = price1Month;
        this.salary1Hour = salary1Hour;
    }

    public int getPrice1Month() {
        return price1Month;
    }

    public int getSalary1Hour() {
        return salary1Hour;
    }

    @Override
    public int salary() {
        int result = 0;
        if (getHourOfMonth() == 40) {
            result += getPrice1Month();
        } else if (getHourOfMonth() > 40) {
            result += (getHourOfMonth() - 40) * getSalary1Hour() + getPrice1Month();
        } else
            result += 0;

        return result;
    }

    @Override
    public String toString() {
        return "Lecturer:" + getNameLec() + ", email='" + getEmail() + ", address='" + getAddress()
                + ", phone=" + getPhone() + ", agreeSalary=" + getHourOfMonth() + ", price1Month="
                + getPrice1Month() + ", salary1Hour=" + getPrice1Month() + ", salary: " + salary()+ " VNĐ";
    }
}
