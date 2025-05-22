public abstract class Vehicle {
    int wheels;
    String fuelType;
    public abstract void startEngine();
}
public class Car extends Vehicle {
    public Car() {
        this.wheels = 4;
        this.fuelType = "Gasoline";
    }

    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting...");
    }
}


public class Main {
    public static void main(String[] args) {
    
        Car myCar = new Car();
        System.out.println("The car has " + myCar.wheels + " wheels.");
        myCar.startEngine();
    }
}
