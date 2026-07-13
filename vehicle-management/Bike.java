package VECHILE_MANAGEMENT;

class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Bike starts with a kick or button.");
    }
}