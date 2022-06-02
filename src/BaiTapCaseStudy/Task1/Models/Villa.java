package BaiTapCaseStudy.Task1.Models;

public class Villa extends Facility{
    private String romStandard;//Tiêu chuẩn phòng
    private double poolArea;//Diện tích hồ bơi
    private int numberFloors;//Số Tầng

    public Villa() {
    }

    @Override
    public String cover() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getServiceName(),
                super.getUsableArea(),
                super.getRentalCosts(),
                super.getPeopleMaximum(),
                super.getRentalType(),
                getRomStandard(),
                getPoolArea(),
                getNumberFloors()
                );
    }

    public Villa(String romStandard, double poolArea, int numberFloors) {
        this.romStandard = romStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceName, double usableArea, double rentalCosts,
                 int peopleMaximum, String rentalType, String romStandard,
                 double poolArea, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.romStandard = romStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRomStandard() {
        return romStandard;
    }

    public void setRomStandard(String romStandard) {
        this.romStandard = romStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return " serviceName: '" + getServiceName() +
                " usableArea: '" + getUsableArea() +
                " rentalCosts: '" + getRentalCosts() +
                " peopleMaximum: '" + getPeopleMaximum() +
                " rentalType: '" + getRentalCosts() +
                " romStandard: '" + romStandard + '\'' +
                " poolArea: '" + poolArea + '\'' +
                " numberFloors: '" + numberFloors + '\'' +
                '}';
    }
}
