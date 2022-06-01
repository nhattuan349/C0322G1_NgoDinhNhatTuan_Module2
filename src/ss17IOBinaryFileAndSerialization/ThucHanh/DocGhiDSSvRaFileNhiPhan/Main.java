package ss17IOBinaryFileAndSerialization.ThucHanh.DocGhiDSSvRaFileNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A", "Đà Nẵng"));
        students.add(new Student(2, "Nguyễn Văn B", "Quy Nhơn"));
        students.add(new Student(3, "Nguyễn Văn C", "Bình Định"));
        students.add(new Student(4, "Nguyễn Văn D", "Sài Gòn"));
        students.add(new Student(5, "Nguyễn Văn E", "Hà Nội"));
        writeToFile("J:\\CG\\CodegymX\\module2\\src\\ss17IOBinaryFileAndSerialization\\" +
                "ThucHanh\\DocGhiDSSvRaFileNhiPhan\\student.csv", students);


        List<Student> studentDataFromFile = readDataFromFile("J:\\CG\\CodegymX\\module2\\" +
                "src\\ss17IOBinaryFileAndSerialization\\" +
                "ThucHanh\\DocGhiDSSvRaFileNhiPhan\\student.csv");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }


    public static void writeToFile(String path, List<Student> students) {
        try {

            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }
}
