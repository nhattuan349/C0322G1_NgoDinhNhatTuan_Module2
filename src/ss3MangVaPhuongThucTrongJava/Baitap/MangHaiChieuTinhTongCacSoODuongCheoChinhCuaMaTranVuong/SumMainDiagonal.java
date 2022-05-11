package ss3MangVaPhuongThucTrongJava.Baitap.MangHaiChieuTinhTongCacSoODuongCheoChinhCuaMaTranVuong;

import java.util.Scanner; // import thu vien

public class SumMainDiagonal {// tao class

    public static void main(String[] args) {// tạo ham main// ham main là phương thuc cua class
        Scanner input = new Scanner(System.in);// Khoi tao dôi tương
        System.out.println("Nhập chiều một cạnh của hình vuông:");//Hiên thị tieu đe
        int width = Integer.parseInt(input.nextLine());//  tạo bien width có kieu du lieu là int Cho người dùng nhập vào chiều dài
        // System.out.println("Nhập chiều rộng mảng 2 chiều:");// Hiển thị tiêu đề nhac nguoi dùng nhập vào chiều rọng
        int height = width;//  tạo bien height có kieu du lieu là int cho người dung nhâp vao

        int[][] array2D = new int[width][];//khởi tạo mang 2 chiêu // vi du witdh =5 thì tao có mang 2 chieu [[0][0][0][0][0]]
        for (int i = 0; i < width; i++) {// làm nở (số phần tử) từng mảng 1 chiều có đọ dài bằng height vidu height bằng 5 và witdh bằng 5 [[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]
            array2D[i] = new int[height];// lam nở mảng 1 chiều theo biến height
            for (int j = 0; j < height; j++) {// for lông cho người dùng nhập vào mảng 2 chiều
                System.out.print("Nhập phần tử thứ " + i + "-" + j + ": ");
                array2D[i][j] = Integer.parseInt(input.nextLine());
            }
        }// kết thúc vòng lặp

        System.out.println("Mảng 2 chiều: ");// Hiển thị tên mảng 2 chiều
        for (int[] ints : array2D) {// cho quét qua tất cả các mảng 1 chiều  trong mảng 2 chiều
            for (int anInt : ints) {// cho quét qua tất cả các phần tử của cá mảng 1 chiều
                System.out.print(anInt + " ");// Hiển 1 mảng 1 chiều
            }
            System.out.print("\n");//
        }

        int sumMainDiagonal = 0; //tạo biến sumMaiDiagonal(tổng đường chéo) có kiểu dữ liệu là int.. quy luật ở đây là : tọa độ i = tọa độ j thì nằm trên một dường chéo viduj (1,1) (2,2) (3,3)
        for (int i = 0; i < array2D.length; i++) {// tạo 2 for lông nhau
           // for (int j = 0; j < array2D[i].length; j++) {
             //   if (i == j) {// điều kiện tọa độ bằng nhau
                    sumMainDiagonal += array2D[i][i];// cộng chuỗi
           //    }
          //  }
        }

        System.out.println("\nTổng các phần tử trên đường chéo chính là: " + sumMainDiagonal);// Hiện thi kết quả
    }// Kết thúc hàm main
}// kết thúc class
