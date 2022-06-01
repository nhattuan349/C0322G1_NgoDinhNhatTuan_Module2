package BaiTapCaseStudy.Task1.Models;

public class Villa extends Facility{
    private String romStandard;//Tiêu chuẩn phòng

    public Villa() {
    }

    public Villa(String romStandard) {
        this.romStandard = romStandard;
    }

    public Villa(String serviceName, double usableArea, double rentalCosts,
                 int peopleMaximum, String rentalType, String romStandard) {
        super(serviceName, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.romStandard = romStandard;
    }

    public String getRomStandard() {
        return romStandard;
    }

    public void setRomStandard(String romStandard) {
        this.romStandard = romStandard;
    }

    @Override
    public String toString() {
        return " serviceName: '" + getServiceName() +
                " usableArea: '" + getUsableArea() +
                " rentalCosts: '" + getRentalCosts() +
                " peopleMaximum: '" + getPeopleMaximum() +
                " rentalType: '" + getRentalCosts() +
                " romStandard: '" + romStandard + '\'' +
                '}';
    }
}
