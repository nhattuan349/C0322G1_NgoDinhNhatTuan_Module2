package ss16IOFile.BaiTap.CopyTileText;

import java.io.*;

public class CopyFile {

    public static void readAndCopyFile(String data1, String data2) {
        File fileData1 = new File(data1);
        File fileData2 = new File(data2);
        try (FileReader fileReader = new FileReader(fileData1);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(fileData1);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            if (!fileData1.exists() && !fileData2.exists()) {
                throw new FileNotFoundException();
            }
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split("");
                for (String copy : arr) {
                    bufferedWriter.write(copy);
                }
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.err.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        String data1 = "J:\\CG\\CodegymX\\module2\\src\\ss16IOFile\\BaiTap\\CopyTileText\\data1";
        String data2 = "J:\\CG\\CodegymX\\module2\\src\\ss16IOFile\\BaiTap\\CopyTileText\\data2";
        readAndCopyFile(data1, data2);
        System.out.println("Sao chép thành công....");
    }
}

