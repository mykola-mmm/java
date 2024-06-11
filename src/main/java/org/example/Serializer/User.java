package org.example.Serializer;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    public String name;
    transient public String password;

    public void sayHello(){
        System.out.println("hii! " + name);
    }
}
