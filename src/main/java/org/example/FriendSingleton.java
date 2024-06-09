package org.example;

public class FriendSingleton {
    private static FriendSingleton instance;

    private String name;

    private FriendSingleton(String name){
        this.name = name;
    }
    public static FriendSingleton createFriendSingleton(String name) {
        if (instance==null) {
            instance = new FriendSingleton(name);
        }
        return instance;
    }
    public String toString(){
        return "The name is " + this.name;
    }
}
