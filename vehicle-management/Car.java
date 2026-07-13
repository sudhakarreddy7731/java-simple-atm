package VECHILE_MANAGEMENT;

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Car engine starts with a key.");
    }
}