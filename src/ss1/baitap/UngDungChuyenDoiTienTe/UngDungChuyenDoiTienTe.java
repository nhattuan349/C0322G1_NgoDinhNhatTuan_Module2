package ss1.baitap.UngDungChuyenDoiTienTe ;

import java.util.Scanner; //import thu vien

public class UngDungChuyenDoiTienTe { // tao class
    public static void main(String[] args) {  //ham main
        double vnd;// khai báo biến chưa có giá trị
        double usd;// khai báo biến chưa có giá trị
        Scanner sc = new Scanner(System.in);// Khởi tạo đối tượng, sc bien doi tuong
        System.out.print("Nhập usd cần chuyển đổi "); // hiện ra màn hình
        usd = sc.nextDouble(); //gán giá trị cho biến
        System.out.print("Nhập vnd cần chuyển đổi"); // hiện ra màn hình
        vnd = sc.nextDouble();//gán giá trị cho biến
        double rateUsd = usd*23000; // khai báo biến và gán giá trị
        double rateVnd = vnd/23000; // khai báo biến và gán giá trị
        System.out.println("usd sau khi quy đổi qua vnd la : " + rateUsd + " vnd" );  // hiện ra màn hình
        System.out.print("vnd sau khi quy đổi qua usd la : " + rateVnd + " usd" ); // hiện ra màn hình



    }
}
