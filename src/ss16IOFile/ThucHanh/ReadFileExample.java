package ss16IOFile.ThucHanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        File file = new File(filePath);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)) {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line = null;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
