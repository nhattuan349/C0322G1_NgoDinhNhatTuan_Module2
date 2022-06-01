package ss17IOBinaryFileAndSerialization.ThucHanh.CopyFileDungLuongLon2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private  static void copyFileUsingStream(File source,File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int lenght;
            while ((lenght = is.read(buffer))>0){
                os.write(buffer,0,lenght);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Nhap link file muon copy");
        String sourcePath = in.nextLine();
        System.out.printf("Nhap link file muon gui den");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try{
            copyFileUsingJava7Files(sourceFile,destFile);
            System.out.println("Copy comleted");
        }catch (IOException ioe){
            System.out.println("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
