package org.internship;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator calculator= new Calculator();
        calculator.setX(1);
        calculator.setY(3);
        System.out.println(calculator.getX());
        System.out.println(calculator.getY());
    }
}