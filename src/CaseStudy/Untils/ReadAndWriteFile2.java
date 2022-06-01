package CaseStudy.Untils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile2 implements Serializable {
    /**
     * Ghi File
     * Serializable: Hổ trợ đọc và ghi file
     */
    public static void WriteFile(String DiachiFile, String Dulieu) {
        try {
            FileWriter fileWriter = new FileWriter(DiachiFile, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(Dulieu);
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Đọc File
     */
    public static List<String[]> ReadFile(String DChiFile) {
        List<String[]> listLine = new ArrayList<>();
        try {
            FileReader fileReader =new FileReader(DChiFile);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String line = null;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null || line.equals("")) {
                    break;
                }
                String[] read = line.split(",");
                listLine.add(read);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
