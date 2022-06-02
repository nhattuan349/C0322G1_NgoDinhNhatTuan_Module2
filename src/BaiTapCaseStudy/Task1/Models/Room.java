package BaiTapCaseStudy.Task1.Models;

public class Room extends Facility{
    private String serviceFree;//Dịch vụ miễn phí đi kèm

    public Room() {
    }

    @Override
    public String cover() {
        return String.format("%s,%s,%s,%s,%s,%s",
                super.getServiceName(),
                super.getUsableArea(),
                super.getRentalCosts(),
                super.getPeopleMaximum(),
                super.getRentalType(),
                serviceFree);
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String serviceName, double usableArea, double rentalCosts,
                int peopleMaximum, String rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return  " serviceName: '" + getServiceFree() +
                " usableArea: '" + getUsableArea() +
                " rentalCosts: '" + getRentalCosts() +
                " peopleMaximum: '" + getPeopleMaximum() +
                " rentalType: '" + getRentalType() +
                " serviceFree: '" + serviceFree + '\'' +
                '}';
    }
}
