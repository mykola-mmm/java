package org.example.Serializer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.name = "me";
        user.password = "passwd";

            FileOutputStream fileOut = new FileOutputStream("UserInfo.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();

            System.out.println("Object info saved");
    }
}
