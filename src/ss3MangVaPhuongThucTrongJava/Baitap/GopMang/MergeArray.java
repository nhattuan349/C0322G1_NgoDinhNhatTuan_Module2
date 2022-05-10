package ss3MangVaPhuongThucTrongJava.Baitap.GopMang;

import java.util.Scanner;// Import thu vien

public class MergeArray {// tao class // Khai báo mot clas
    public static void main(String[] args) {// tao ham // Phuong thuc cua class
        Scanner input = new Scanner(System.in);//Khởi tạo đối tượng, input là bieens của đói tượng

        int[] array1 = new int[5];// khởi tạo mảng với mảng mới có 5 phần tử
        System.out.println("Input elements of array 1:");//
        for (int i = 0; i < array1.length; i++) {// tạo mảng cho người dung nhập vào
            System.out.print("Element " + (i + 1) + ": ");// Hiển thị thư tự nhập mảng
            array1[i] = input.nextInt();// cho người dùng nhập vào
        }

        int[] array2 = new int[5];// Khởi tạo mảng có 5 phần tử
        System.out.println("Input elements of array 2:");// Hiển thị tiêu đề nhắc người dùng nhập vào
        for (int i = 0; i < array2.length; i++) {//tạo mảng cho người dùng nhập vào
            System.out.print("Element " + (i + 1) + ": ");// Hiển thị thư tự nhập mảng
            array2[i] = input.nextInt();//  cho người dùng nhập vào
        }

        System.out.print("Array 1: ");//Hiển thị ten mảng array1 lên màn hình
        for (int value1 : array1) {// Vòng lặp quét qua hết phần tử trong mảng rồi hien len man hình
            System.out.print(value1 + " ");// Hiển thị mảng với các phần tử của mảng
        }
        System.out.print("\nArray 2: ");// Hiển thị ten mảng array2 lên màn hình
        for (int value2 : array2) {//Vòng lặp quét qua hét phần tử trong mảng rồi hiện lên man hình
            System.out.print(value2 + " ");// Hiển thị mảng với các phần tử của mảng
        }

        int[] array3 = new int[array1.length + array2.length];// Khởi tạo mảng thứ 3 có chiều dài mảng bằng tổng 2 mảng công lại
        System.out.print("\nArray 3: ");// Hiển thị tên array3 lên màng hình .. \n dugf để xuống dòng
        for (int i = 0; i < array1.length; i++) {// chạy vòng for lấy tất cả giá trị mảng 1 vào tròng mảng 3 với vị trí bằng với mảng 1
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {//chạy vongwf for lấy hết tất cả các giá trị mảng 1 vào trong mảng 3 với vị trí ở sau chiều dài mảng 1)
            array3[array1.length + i] = array2[i];
        }
        for (int value : array3) {// chạy vòng lăp quét qua tất cả các phần tu cua mang 3 rồi cho hiện lên màn hình
            System.out.print(value + " ");
        }
    }// Kết thúc hàm main
}//kết thúc class
