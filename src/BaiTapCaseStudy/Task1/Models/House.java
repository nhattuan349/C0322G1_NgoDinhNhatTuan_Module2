package BaiTapCaseStudy.Task1.Models;

public class House extends Facility{
    private String romStandard;//Tiêu chuẩn phòng
    private double numberFloors;//Diện tích hồ bơi

    public House() {
    }

    @Override
    public String cover() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getServiceName(),
                super.getUsableArea(),
                super.getRentalCosts(),
                super.getPeopleMaximum(),
                super.getRentalType(),
                getRomStandard(),
                getNumberFloors());
    }

    public House(String romStandard, double numberFloors) {
        this.romStandard = romStandard;
        this.numberFloors = numberFloors;
    }

    public House(String serviceName, double usableArea, double rentalCosts,
                 int peopleMaximum, String rentalType, String romStandard, double numberFloors) {
        super(serviceName, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.romStandard = romStandard;
        this.numberFloors = numberFloors;
    }

    public String getRomStandard() {
        return romStandard;
    }

    public void setRomStandard(String romStandard) {
        this.romStandard = romStandard;
    }

    public double getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(double numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return  " House{" +
                ", serviceName: '" + getServiceName() + '\'' +
                ", usableArea: '" + getUsableArea() + '\'' +
                ", rentalCosts: '" + getRentalCosts() + '\'' +
                ", peopleMaximum: '" + getPeopleMaximum() + '\'' +
                ", rentalType: '" + romStandard + '\'' +
                ", numberFloors: " + numberFloors +
                '}';
    }
}
