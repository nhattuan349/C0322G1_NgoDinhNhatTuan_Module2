package ss16IOFile.Lythuyet.model;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static final String FILE_NAME ="J:\\CG\\CodegymX\\module2\\src\\ss16IOFile\\Lythuyet\\data\\student.csv";
    public static final String COMMA = ",";

    public static void main(String[] args) {

        //Output file
//        Student student1 = new Student(1,"John","20/02/1998");
//        Student student2 = new Student(2,"David","01/10/1997");
//        Student student3 = new Student(3,"Steven","07/07/1996");
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//
//        String line =null;
//        for (Student student:studentList) {
//            line = student.getId()+COMMA+student.getName()+COMMA+student.getDateOfBirth();
//            fileUntils.writeFile(FILE_NAME,line);
//        }
        //input file
        List<String> listLine = fileUntils.readFile(FILE_NAME);
        System.out.println(listLine);

        String[] lineSplit = listLine.get(0).split(COMMA) ;
        Student student1 =new Student(Integer.parseInt(lineSplit[0]),lineSplit[1],lineSplit[2]);
        System.out.println(student1.getId()+" "+student1.getName()+" "+student1.getDateOfBirth());
    }
}
