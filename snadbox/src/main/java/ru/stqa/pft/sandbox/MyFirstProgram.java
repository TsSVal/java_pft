package ru.stqa.pft.sandbox;

public class MyFirstProgram {
public static void main(String[] args) {
hello ("World");
    hello ("user");
    hello ("sheep");
    double len = 5;
    System.out.println("square area with side " + len + " = " + area (len));
    double a = 4;
    double b = 6;
    System.out.println("square of rectangular box with sides " + a + " and " + b + " = " + area (a, b));
}
public static void hello (String somebody) {
    System.out.println("Hello, " + somebody + " !");
}
public static double area (double l) {
   return  l * l;
}
public static double area (double a, double b) {
    return a * b;
}
}