package BaiTapCaseStudy.Task1.Models;

public class Customers extends Person{
    private String guestType;//Loại khách
    private String address;//Địa chỉ

    public Customers() {
    }

    public Customers(String typeOfGuest, String address) {
        this.guestType = typeOfGuest;
        this.address = address;
    }

    public Customers(int code, String name, String dateOfBirth, String gender,
                     int id, int phoneNumber, String email, String typeGuest, String address) {
        super(code, name, dateOfBirth, gender, id, phoneNumber, email);
        this.guestType = typeGuest;
        this.address = address;
    }

    public String getTypeGuest() {
        return guestType;
    }

    public void setTypeGuest(String typeGuest) {
        this.guestType = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  " Customers: " +
                ", code: '" + getCode() + '\'' +
                ", name: '" + getCode() + '\'' +
                ", dateOfBirth: '" + getDateOfBirth() + '\'' +
                ", gender: '" + getGender() + '\'' +
                ", id: '" + getId() + '\'' +
                ", phoneNumber: '" + getPhoneNumber() + '\'' +
                ", email: '" + getEmail() + '\'' +
                ", typeGuest: '" + guestType + '\'' +
                ", address: '" + address + '\'' +
                '}';
    }
}
