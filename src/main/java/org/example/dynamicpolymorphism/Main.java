package org.example.dynamicpolymorphism;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What animal do you want?");
//        System.out.println("1: dog\t2:cat");
//        int choice = scanner.nextInt();
//
//        if (choice == 1) {
//            myAnimal = new Dog();
//            myAnimal.speak();
//        }
//        else if (choice == 2) {
//            myAnimal = new Cat();
//            myAnimal.speak();
//        }
//        else {
//            myAnimal = new Animal();
//            myAnimal.speak();
//        }


        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Exceptions");
            System.out.println("Enter the number to divide - ");
            int divide = scanner.nextInt();
            System.out.print("Enter number to divide by - ");
            int dividor = scanner.nextInt();
            int res = divide/dividor;
            System.out.println("result - " + res);
        } catch(ArithmeticException e) {
            System.out.println("Division by zero is not possible");
            System.out.println(e.getMessage());
        } catch(InputMismatchException e) {
            System.out.println("pls use integers as an input");
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("something went wrong");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Executing the finall block");
            scanner.close();
        }


    }
}
