package oop;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();  

        Animal myDog = new Dog();
        myDog.sound();  
    }
}
