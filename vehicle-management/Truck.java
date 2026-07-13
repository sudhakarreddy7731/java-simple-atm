package VECHILE_MANAGEMENT;

class Truck extends Vehicle {

    Truck(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Truck engine starts with heavy ignition.");
    }
}