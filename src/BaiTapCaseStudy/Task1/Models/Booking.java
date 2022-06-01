package BaiTapCaseStudy.Task1.Models;

public class Booking {
    private int bookingCode;// Mã booking
    private int dayStart;//ngày bắt đầu
    private int dayStop;//ngày kết thúc
    private int idcustomer;//mã khách hàng
    private String serviceName;//tên dịch vụ
    private String TypeService;//loại dịch vụ

    public Booking() {
    }

    public Booking(int bookingCode, int dayStart, int dayStop, int idcustomer, String serviceName, String typeService) {
        this.bookingCode = bookingCode;
        this.dayStart = dayStart;
        this.dayStop = dayStop;
        this.idcustomer = idcustomer;
        this.serviceName = serviceName;
        TypeService = typeService;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDayStart() {
        return dayStart;
    }

    public void setDayStart(int dayStart) {
        this.dayStart = dayStart;
    }

    public int getDayStop() {
        return dayStop;
    }

    public void setDayStop(int dayStop) {
        this.dayStop = dayStop;
    }

    public int getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(int idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeService() {
        return TypeService;
    }

    public void setTypeService(String typeService) {
        TypeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", dayStart=" + dayStart +
                ", dayStop=" + dayStop +
                ", idcustomer=" + idcustomer +
                ", serviceName='" + serviceName + '\'' +
                ", TypeService='" + TypeService + '\'' +
                '}';
    }
}
