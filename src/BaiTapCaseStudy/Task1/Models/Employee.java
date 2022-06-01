package BaiTapCaseStudy.Task1.Models;

public class Employee extends Person {
    private String level;//Trình độ
    private String location;//Vị trí
    private double salary;//lương

    public Employee() {
    }

    public Employee(String level, String address, double salary) {
        this.level = level;
        this.location = address;
        this.salary = salary;
    }

    public Employee(int code, String name, String dateOfBirth, String gender, int id, int phoneNumber, String email, String level, String address, double salary) {
        super(code, name, dateOfBirth, gender, id, phoneNumber, email);
        this.level = level;
        this.location = address;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAddress() {
        return location;
    }

    public void setAddress(String address) {
        this.location = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  " --code: "+getCode()+
                " --name: "+getName()+
                " --dateOfBirth: "+getDateOfBirth()+
                " --gender: "+getGender()+
                " --id: "+getId()+
                " --phoneNumber: "+getPhoneNumber()+
                " --email: "+getEmail()+
                " --address: "+getAddress()+
                " --level: "+level+
                " --ocation: "+location+
                " --salary: "+salary;
    }
}
