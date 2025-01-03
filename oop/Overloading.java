package oop;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));       // فراخوانی متد با پارامترهای int
        System.out.println(calc.add(5.5, 10.5));   // فراخوانی متد با پارامترهای double
    }
}
