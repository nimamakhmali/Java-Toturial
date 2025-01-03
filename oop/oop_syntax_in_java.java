package oop;

// class
class Car {
    private String model;  // private
    private int year;

    public void setModel(String model) {  // setter
        this.model = model;
    }

    public void setYear(int year) { //setter
        this.year = year;
    }
    public String getModel() {  // getter
        return model;
    }
    public int getYear() {
        return year;
    }
    void drive() {
        System.out.println("The car is driving.");
    }
}



public class oop_syntax_in_java {
    // object
    public static void main(String[] args) {
      Car myCar = new Car();  
        myCar.setModel("Toyota"); 
        myCar.setYear(2020);
        myCar.getModel();
        myCar.getYear();
        myCar.drive();   
    }
}
