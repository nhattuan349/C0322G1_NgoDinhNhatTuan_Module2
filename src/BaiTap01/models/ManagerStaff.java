package BaiTap01.models;

public class ManagerStaff extends Person {
    private String salaryCb;
    private String numSalary;

    public ManagerStaff() {
    }

    public ManagerStaff(String salaryCb, String numSalary) {
        this.salaryCb = salaryCb;
        this.numSalary = numSalary;
    }

    public ManagerStaff(int id, String codePerson, String fullName, String dayOfBirth, String address, String salaryCb, String numSalary) {
        super(id, codePerson, fullName, dayOfBirth, address);
        this.salaryCb = salaryCb;
        this.numSalary = numSalary;
    }

    public String getSalaryCb() {
        return salaryCb;
    }

    public void setSalaryCb(String salaryCb) {
        this.salaryCb = salaryCb;
    }

    public String getNumSalary() {
        return numSalary;
    }

    public void setNumSalary(String numSalary) {
        this.numSalary = numSalary;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getCodePerson(),
                super.getFullName(),
                super.getDayOfBirth(),
                super.getAddress(),
                getSalaryCb(),
                getNumSalary()
        );
    }

    @Override
    public String toString() {
        return "Nvql có tên :" + getFullName() +
                " ID: " + getId() +
                " Mã nhân viên: " + getCodePerson() +
                " Ngày Sinh: " + getDayOfBirth() +
                " Địa chỉ: " + getAddress() +
                " Lương cơ bản: " + getSalaryCb() +
                " Hệ số lương: " + getNumSalary()
                ;
    }
}
