package org.example;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.*;
import org.example.vehicle.Car;
import org.example.Human;
import org.example.*;

public class UserInput {
    public static void main (String[] args) {
//        dataTypeConvertion();
//        guiTest();
//        mathTest();
//        randomTest();
//        whileTest();
//        printCustomBox();
//        printArray();
//        stringMethods();
//        wrapperDataTypes();
//        arrayList();
//        arrayList2D();
//        forEach();
//        helloMethod("Bro", 20);
//        System.out.println(add(1,3));
//        System.out.println(add(1,3, 5));
//        System.out.println(add(1,3.0, 5));
//        printfMethod();
//        Car myCar = new Car();
//        myCar.drive();
//        Car myCar2 = new Car();
//        Human me = new Human("me", 10, 50.12);
//        System.out.println(me.name);
//        System.out.println(me.age);
//        System.out.println(me.weight);
//        me.eat();
//        DiceRoller dice = new DiceRoller(10);
//        for (int i = 0; i < 10; i++) {
//            dice.roll();
//
//        }
//        System.out.println(dice.number);
//        Pizza myPizza = new Pizza("thin bread", "tomatpo", "white cheese", "salami");
//        System.out.println(myPizza.topping);
//        System.out.println(myPizza);
//        System.out.println(myPizza.toString());

        Pizza[] myPizzaArray = new Pizza[10];
        for(Pizza obj : myPizzaArray) {
            obj = new Pizza("thin bread", "tomatpo", "white cheese", "salami");
            System.out.println(obj.toString());
        }
    }

    static void printfMethod() {
        System.out.printf("This is decimal %d\n" ,123);
        System.out.printf("This is double %.1f\n", 123.0);
        System.out.printf("This is boolean %b\n", true);
        System.out.printf("This is my string %10s.", "This is my string      ");
    }

    static int add (int a, int b) {
        return a+b;
    }

    static int add (int a, int b, int c) {
        return a+b+c;
    }

    static double add (double a, double b) {
        return a+b;
    }

    static double add (double a, double b, double c) {
        return a+b+c;
    }



    static void helloMethod(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("Your age " + age);
    }

    public static void forEach() {
        String[] list = {"1", "2", "3", "4", "5", "6"};

        for(String i : list) {
            System.out.println("element - " + i);
        }
    }


    public static void arrayList2D(){
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("egs");
        bakeryList.add("c");
        bakeryList.add("pasta");
        ArrayList<String> otherList = new ArrayList<String>();
        otherList.add("notebook");

        ArrayList<ArrayList<String>> allList = new ArrayList<>();
        allList.add(bakeryList);
        allList.add(otherList);

        System.out.println(allList.get(0).get(0));


    }

    public static void arrayList() {
        ArrayList<String> food = new ArrayList<String>();
        System.out.println("Array elements " + food);
        food.add("meal1");
        food.add("meal2");
        food.add("meal3");
        food.add("meal1");
        food.add("meal2");
        food.add("meal3");
        food.add("meal1");
        food.add("meal2");
        food.add("meal3");


        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println();

        food.set(0, "new meal1");
        food.set(1, "new meal2");
        food.remove(0);
        food.clear();
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }

    public static void wrapperDataTypes() {
        Boolean a = true;
        Character b = 'b';
        Integer c = 1;
        Double d = 1.2;
        String e = "str";
    }

    public static void stringMethods(){
        String name = "Me";
        boolean result = name.equals("Me");
        System.out.println(result);
        System.out.println("Nane".equalsIgnoreCase("nane"));
        System.out.println("1234567890".charAt(0));
        String digits = "1234567890";
        System.out.println(digits.charAt(9));
        System.out.println(digits.indexOf("456"));
        System.out.println("qwertyuiop".toUpperCase());
        System.out.println("qwertyuiop qwertyuio".trim());
    }

    public static void printArray() {
        String[][] phoneKeyboard = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"*", "0", "#"}
        };
        for (int i = 0; i < phoneKeyboard.length; i++) {
            for (int j = 0; j < phoneKeyboard[i].length; j++) {
                System.out.print(phoneKeyboard[i][j]);
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void printCustomBox() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns");
        int columns = scanner.nextInt();
        System.out.println("Enter the symbol to use");
        String symbol = scanner.next();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static void whileTest() {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name == null || name.isBlank()) {
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }

        String name2 = "";
        do {
            System.out.println("Enter your name");
            name2 = scanner.nextLine();
        } while (name2.isBlank());
    }

    public static void dataTypeConvertion() {
        int number = 100;
        System.out.println((double) 100 / 3);
        System.out.println(number / 3);

    }

    public static void userInput(){
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the day today?");
        String currentDay = scanner.nextLine();
        System.out.println("today is " + currentDay);
    }

    public static void guiTest() {
        JFrame mainFrame = new JFrame("Main Window");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,300);
        mainFrame.setVisible(true);

        JButton button = new JButton("Submit");
        button.setSize(50,20);
        mainFrame.add(button, BorderLayout.SOUTH);
        String name = JOptionPane.showInputDialog(mainFrame, "your name");
        JOptionPane.showMessageDialog(mainFrame, "Hello " + name);
        Integer age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
    }

    public static void mathTest() {
//        double x = 3.14500001;
//        double y = 3.1450000000000000001;
//        double max = Math.max(x,y);
//        System.out.println(max);
//        System.out.println(Math.round(max));
        double x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a");
        x = scanner.nextDouble();
        System.out.println("Enter side b");
        y = scanner.nextDouble();
        System.out.println("the hypotenuse - " + Math.sqrt(x*x+y*y));

    }

    public static void randomTest() {
        Random random = new Random();
        int x = random.nextInt(6) + 1;
        System.out.println(x);

        int counterAbove05 = 0;
        int counterBelove05 = 0;
        for (int i = 0; i < 1000; i++) {
            double num = random.nextDouble();
            if (num >= 0.5) {
                counterAbove05++;
            } else {
                counterBelove05++;
            }
        }
        System.out.println(counterAbove05);
        System.out.println(counterBelove05);
    }
}
