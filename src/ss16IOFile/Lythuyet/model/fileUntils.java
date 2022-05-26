package ss16IOFile.Lythuyet.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class fileUntils {
    // có 2 tham số dầu vào
    public static void writeFile(String pathFile, String line) {

        try {
            // tạo ra Class, với FileWriter() có 2 tham số truyền vào là pathFile,
            // thằng thứ 2 hính là thuộc tính update file hay không thì ở dây mình chọn có là true
            // sau đó chương trình sẽ báo lỗi phải thêm try/catch vào
            FileWriter fileWriter = new FileWriter(pathFile, true);
            // Tạo thêm class bufferedWriter,bufferedWriter nó hỗ trợ thêm cho mình một số phương thức nữa
            // Với tham số đầu vào sẽ chính là file fileWriter của mình
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Thì chúng ta ghi như thế nào?
            // thì chúng ta sử dụng phương thức write() và ghi cái line của chúng ta vào
            bufferedWriter.write(line);
            // Khi mà ghi xong line thi chúng ta sẽ new luôn, tức là sẽ tạo một dòng mới luôn
            // thì mục đích mình dụng bufferedWriter thì nó sẽ cáinewLine() này
            // Ví dụ mình vừa viết xong dong 22 nó sẽ xuống dòng cho mình
            bufferedWriter.newLine();

            // Cuối cùng mình đóng line lại, phải nhở có phương thức close() này
            //Viết xong một file phải đóng file colse() lại , thì lúc đó  để lưu dữ liệu dile vào
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 // Thì ở ta tạo thêm một phương thức nữa
    // readFile thì Ở phương thức này ta sẽ trả về một List<String>: tức là từng dòng của chúng ta, từng dòng trong file
    // và tham số dầu vào là pathfile
    public static List<String> readFile(String pathFile) {
        //Thì ở dây mình tạo một  List<String> dể nó hứng dữ liệu luôn đặt là listLine
        List<String> listLine = new ArrayList<>();

        try {
            //Mình tạo một fileReader tham số đầu vào chính là pathFile của mình, rồi ép thêm ễcption vào cho nó luôn
            FileReader fileReader = new FileReader(pathFile);
            // Chúng ta sử dụng thêm thằng BufferedReader, BufferedReader sẽ hổ trợ cho mình cái phương thức là readLine()
            // Cái tham số đâu vào là cái fileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Thì ở đây tạo ra cái String line cái String này dùng để lưu từng line, từng mà chúng ta đi qua
            String line = null;
            // Thì chngs ta sử dụng vòng lặp ở đây, thì cứ mỗi lần lặp ta sẽ đi qua từng dòng cái này ta sẽ gán bằng luôn
            //và line này ta sẽ gán bằng gì? --> bufferedReader.readLine()
            //và chúng ta đọc đến khi nào? --> Cho đến khi nào nó khác null -->!= null
            // Tức là dòng while này sẽ như thế nào? --> Tức là mình sẽ đọc từng line cho đến line cuối thi thôi
            while ((line = bufferedReader.readLine()) != null) {
                // thì ở ta ép vào luôn listLine.add(line);
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // Chúng ta ép thêm exception() vào
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Và kết thúc hàm ta trả về cái listLine
        return listLine;
    }
}
// Nếu có thì chương trình sẽ trả về  listLine.add(line); có chứa các line ở trong này
// còn không sẽ trả về một listLiine bị rỗng luôn

