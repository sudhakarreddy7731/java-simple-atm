package VECHILE_MANAGEMENT;

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void startEngine();

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}