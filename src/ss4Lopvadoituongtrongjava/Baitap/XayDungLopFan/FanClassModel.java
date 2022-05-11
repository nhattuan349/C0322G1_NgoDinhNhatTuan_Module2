package ss4Lopvadoituongtrongjava.Baitap.XayDungLopFan;

public class FanClassModel {
    public static void main(String[] args) {
        FanClassRun  fan1 = new FanClassRun (3, true, 10, "Màu Vàng");
        FanClassRun  fan2 = new FanClassRun (2, false, 5, "Màu xanh");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
}
    }