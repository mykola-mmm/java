package org.example.Deserializer;
import org.example.Serializer.User;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;
        FileInputStream fileIn = new FileInputStream("UserInfo.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        System.out.println(ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID());
    }
}
