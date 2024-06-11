package org.example.generics;

public class Container<T> {

    T content;

    Container(T content){
        this.content = content;
    }

    public String toString(){
        return "Container holding: " + this.content;
    }

    public T getContent(){
        return this.content;
    }
}
