package ss4Lopvadoituongtrongjava.Baitap.XayDungLopStopwatch;

public class StopwatchClassModel {
    public static long[] sort(long... a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    long temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        long[] a = new long[100000];
        StopwatchClassRun sw = new StopwatchClassRun();

        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 100000);
        }
        sw.start();
        sort(a);
        sw.stop();
        System.out.println("Thoi gian de sap xep cho  100.000 so la   :" + sw.getElapsedTime() + " miligiay");
    }
}
//public class StopwatchClassModel {// tao mang
//    public static long [] sort(long... a) {// long ...a : chưa biết bao nhiêu giá trị trong đay có thể chứa được nhiều giá trị
//        for (int i = 0; i < a.length; i++) {// sắp xếp theo thứ tự tang dần
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[j] < a[i]) {
//                    long temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }return a;// trả về mnagr sau khi sắp xếp
//    }
//    public static void main(String[] args) {
//        long[] a = new long[100000];// Khai báo khởi tạo mảng có 1000000 giá trị
//        StopwatchClassRun sw = new StopwatchClassRun();
//
//        for (int i = 0; i < 100000; i++) {// Điền 1000000 giá trị vào mảng
//            a[i] = (int) (Math.random() * 100000);// math ramdom tra ve tun 0 tiem can 1// Điều ngầu nhiên 1000000 số nguyên
//        }
//        sw.start();// thời gian bắt đầu
//        sort(a);// xử lý =thời gian kết thức - thời gian bắt đầu
//        sw.stop();//thời gian kết thúc
//        System.out.println("Thoi gian de sap xep cho  100.000 so la   :" + sw.getElapsedTime() + " miligiay");
//
//    }
//}