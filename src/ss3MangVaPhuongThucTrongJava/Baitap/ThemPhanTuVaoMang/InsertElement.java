package ss3MangVaPhuongThucTrongJava.Baitap.ThemPhanTuVaoMang;

import java.util.Scanner;//import thu vien

public class InsertElement {// tao class
    public static void main(String[] args) {// tao ham main// main là phương thúc cua class
        int[] arrays = {10, 4, 6, 7, 8, 7, 9, 1, 5, 2, 15};// tạo mảng và gán giá trị cho mảng

        Scanner scanner = new Scanner(System.in);// Khởi tạo đối tượng, scanner là biến của đối
        System.out.printf("%-20s%s", "Elements in array: ", "");// Hiện thị 2 chuỗi % thứ tự vị trí ,-20: cách ra 20 khoảng trắng, s là kiểu dữ liệu String
        for (int item : arrays) {// Cho quét qua tất cả các phần tử trong mảng
            System.out.print(item + "\t");// hiển thị khoảng tab
        }

        System.out.print("\nInput element need insert: ");// Hiển thị tiêu đề và đấu cách xuống dòng
        int x = scanner.nextInt();// Tạo biến x cho người dùng nhập vào

        System.out.print("Input index element need insert: ");// Hiện thị vị trí với nội dung nhắc người dùng nhập vào vị trí phần muốn them
        int indexInsert = scanner.nextInt();//Cho người dùng nhập vào vị trí

        if (indexInsert <= -1 || indexInsert > arrays.length - 1) {// Điều kiện người dùng cố tình nhập sai hoặc nhập sai
            System.out.println("Not allow add element to array.");// hiện thị thông báo người dùng đã nhập sai
        } else {
            for (int i = arrays.length - 1; i > indexInsert; i--) {// Các trường hợp
                arrays[i] = arrays[i - 1];
            }
            arrays[indexInsert] = x;
            System.out.printf("%-20s%s", "Elements after: ", "");
            for (int item : arrays) {
                System.out.print(item + "\t");
            }
        }
    }
}
