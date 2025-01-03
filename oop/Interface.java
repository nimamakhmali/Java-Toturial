package oop;

interface Animal {
    void sound();  
    void eat();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }

    public void eat() {
        System.out.println("The dog is eating.");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("The cat is eating.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal myDog = new Dog();  
        myDog.eat();    
        Animal myCat = new Cat();  
        myCat.sound();  
        myCat.eat();    
    }
}
