package Ex5_KeThua;

public class VisitLec extends Lecturer {
    private static final int price = 200000;
    private String company;

    public VisitLec(String nameLec, String email, String address, String phone, int hourOfMonth, String company) {
        super(nameLec, email, address, phone, hourOfMonth);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public int salary() {
        return price * getHourOfMonth();

    }

    @Override
    public String toString() {
        return "Lecturer: " + getNameLec() + ", email='" + getEmail() + ", address='" + getAddress()
                + ", phone=" + getPhone() + ", agreeSalary=" + getHourOfMonth() + ", company='"
                + getCompany() + ", salary: " + salary()+" VNĐ";
    }
}
