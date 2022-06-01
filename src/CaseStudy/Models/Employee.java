package CaseStudy.Models;

public class Employee extends Person{
    private String Chucvu;

    public Employee() {
    }

    public Employee(String chucvu) {
        Chucvu = chucvu;
    }

    public Employee(String name, String address, String gender, String chucvu) {
        super(name, address, gender);
        Chucvu = chucvu;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String chucvu) {
        Chucvu = chucvu;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Chucvu='" + Chucvu + '\'' +
                '}';
    }
}
