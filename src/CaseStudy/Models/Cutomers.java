package CaseStudy.Models;

public class Cutomers extends Person{
    private String guestType;

    public Cutomers() {
    }

    public Cutomers(String guestType) {
        this.guestType = guestType;
    }

    public Cutomers(String name, String address, String gender, String guestType) {
        super(name, address, gender);
        this.guestType = guestType;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    @Override
    public String toString() {
        return "Cutomers{" +
                "guestType='" + guestType + '\'' +
                '}';
    }
}
