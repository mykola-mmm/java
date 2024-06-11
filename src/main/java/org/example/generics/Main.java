package org.example.generics;

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
    }



//    public static void displayArray(Integer[] array){
//        for(Integer x: array) {
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }

    public static <T> void displayArray(T[] array) {
        for(T x: array){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
