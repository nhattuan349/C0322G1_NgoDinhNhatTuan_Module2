package ss4Lopvadoituongtrongjava.Baitap.XayDungLopQuadraticequationPhuongTrinhBacHai;

public class QuadraticeQuationClassRun {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticeQuationClassRun() {
    }

    public QuadraticeQuationClassRun(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }

    @Override
    public String toString() {
        return this.a + "x2 + " + this.b + "x + " + this.c + " = 0";
    }

}
