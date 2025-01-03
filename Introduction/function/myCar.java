package function;

public class myCar {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.model = "BMW";  
        myCar.year = 2020;
        
        myCar.startEngine();
        
      
        System.out.println("Model :" + myCar.model);
        System.out.println("year : " + myCar.year);
    }
}

class Car {
   
    String model;
    int year;

    public void startEngine() {
        System.out.println("Engine started!");
    }
}
