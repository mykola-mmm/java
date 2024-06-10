package org.example.package1;
import org.example.package2.*;

public class A {
    protected String protectedMessage = "This is protected message";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);

        B b = new B();
//        System.out.println(b.privateMessage);
    }
}
