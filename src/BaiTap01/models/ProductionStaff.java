package BaiTap01.models;

public class ProductionStaff extends Person {
    private String numSp;
    private String moneySp;

    public ProductionStaff() {
    }

    public ProductionStaff(String numSp, String moneySp) {
        this.numSp = numSp;
        this.moneySp = moneySp;
    }

    public ProductionStaff(int id, String codePerson, String fullName, String dayOfBirth, String address, String numSp, String moneySp) {
        super(id, codePerson, fullName, dayOfBirth, address);
        this.numSp = numSp;
        this.moneySp = moneySp;
    }

    public String getNumSp() {
        return numSp;
    }

    public void setNumSp(String numSp) {
        this.numSp = numSp;
    }

    public String getMoneySp() {
        return moneySp;
    }

    public void setMoneySp(String moneySp) {
        this.moneySp = moneySp;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getCodePerson(),
                super.getFullName(),
                super.getDayOfBirth(),
                super.getAddress(),
                getNumSp(),
                getMoneySp()
        );
    }

    @Override
    public String toString() {
        return "Nvsx có tên :" + getFullName() +
                " ID: " + getId() +
                " Mã nhân viên: " + getCodePerson() +
                " Ngày Sinh: " + getDayOfBirth() +
                " Địa chỉ: " + getAddress() +
                " Số sản phẩm: " + getNumSp() +
                " Số tiền: " + getMoneySp()
                ;
    }
}
