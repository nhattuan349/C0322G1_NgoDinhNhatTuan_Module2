package ss5AccessModifierStaticMethodStaticProperty.Baitap.XayDungLopChiGhiTrongJava;

public class StudentClassModel {
    public static void main(String[] args) {
        StudentClassRun student1 = new StudentClassRun();
        System.out.println(student1.getName() + " " + student1.getClasses());
        student1.setName("NhatTuan");
        student1.setClasses("C0322G1");
        System.out.println(student1.getName() + " " + student1.getClasses());
    }
}
