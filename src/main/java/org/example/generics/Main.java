package org.example.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        Double[] doubleArray = {1.0, 2.0, 3.0};
        Character[] charArray = {'1','2','3'};
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);

        Container<String> newContainer = new Container<>("t");
        System.out.println(newContainer.getContent());
        System.out.println(newContainer);

        System.out.println(getFirstElement(intArray));
        System.out.println(getFirstElement(doubleArray));
        System.out.println(getFirstElement(charArray));

        MyIntegerClass myInt = new MyIntegerClass(12);
        System.out.println(myInt.getValue());
        MyGenericClass<String> myGen1 = new MyGenericClass("asd");
        System.out.println(myGen1.getValue());
        ArrayList<String> myList = new ArrayList<>();
        myList.add("adsa");
        myList.add("adsa2");
        System.out.println(myList);
    }




    public static <T> void displayArray(T[] array) {
        for(T x: array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static <T> T getFirstElement(T[] array){
        return array[0];
    }
}
