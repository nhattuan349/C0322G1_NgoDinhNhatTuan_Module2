package ss3MangVaPhuongThucTrongJava.Baitap.DemSoLanXuatHienCuaKyTuTrongChuoi;

import java.util.Scanner;// import thu vien

public class CountCharInString {// tao class // Khai bao class
    public static void main(String[] args) {// tao ham // là ham main là phương thuc cua class
        String str = "Codegym codegym CODEGYM";// Tạo biến str có kiếu dữ liệu là String và gán giá tri cho biến
        Scanner input = new Scanner(System.in);//Khơi tạo đối tượng, input là biến của dối tượng

        System.out.print("Nhập kí tự muốn tìm kiếm: ");// hiển thị tiêu dề
        char KyTu = input.nextLine().charAt(0);// Tao biến ch có kiểu dữ liệu là Character và cho người dùng nhập vào và CharAt()

        int count = 0;//tao bien dem
        for (int i = 0; i < str.length(); i++) {//Công thuc dem so lan xuat hien
            if (str.charAt(i) == KyTu) {// so sánh ký tự đầu tiên giống với KyTu không, nếu dúng đếm 1 lần
                count++;
            }
        }

        System.out.println("Có " + count + " kí tự " + KyTu + " trong chuỗi.");// Hiển thi kết quả
    }// kết thúc hàm main
}// Kết thúc class
