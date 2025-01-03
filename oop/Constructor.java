package oop;

class Car {
    String model;
    int year;

    // default
    public Car() {
        model = "Unknown";
        year = 2000;
    }

    // parameter
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.displayInfo();

        Car car2 = new Car("Toyota", 2022);
        car2.displayInfo();
    }
}
