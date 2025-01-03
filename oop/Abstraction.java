package oop;

abstract class Animal {
    abstract void sound();  // abstract method
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  
    }
}
