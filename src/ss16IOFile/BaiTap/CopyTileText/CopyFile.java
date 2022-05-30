package ss16IOFile.BaiTap.CopyTileText;

import java.io.*;

public class CopyFile {
    public static void readAndCopyFile(String source, String target) {
        File fileSource = new File(source);
        File fileTarget = new File(target);
        try (FileReader fileReader = new FileReader(fileSource);
             BufferedReader bufferedReader = new BufferedReader(fileReader);

             FileWriter fileWriter = new FileWriter(fileTarget);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            if (!fileSource.exists() && !fileTarget.exists()) {
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
        String source = "J:\\CG\\CodegymX\\module2\\src\\ss16IOFile\\BaiTap\\CopyTileText\\source.txt";
        String target = "J:\\CG\\CodegymX\\module2\\src\\ss16IOFile\\BaiTap\\CopyTileText\\target.txt";
        readAndCopyFile(source, target);
        System.out.println("Sao chép thành công....");
    }
}

