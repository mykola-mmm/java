package org.example.fileclass;
import java.io.*;

public class Main {
    public static void main(String[] args){
//        File file = new File("secret");
//        if (file.exists()) {
//            System.out.println("that file exsists!");
//            System.out.println(file.getAbsolutePath());
//        } else {
//            System.out.println("that file does not exsists");
//        }
//        File newFile = new File("D:/java_root/projects/javaBootCamp/secret");
//        if (newFile.exists()) {
//            System.out.println("that file exsists!");
//            System.out.println(file.getAbsolutePath());
//            System.out.println(file.getPath());
//
//
//        } else {
//            System.out.println("that file does not exsists");
//        }

//        try {
//            FileWriter writer = new FileWriter("poem.txt");
//            writer.write("1st line\n2nd line\nEOF");
//            writer.append("another line");
//
//        } catch (IOException e) {
////            System.out.println(e);
//            e.printStackTrace();
//        } finally {
//        }

        try {
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
