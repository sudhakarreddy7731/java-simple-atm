package VECHILE_MANAGEMENT;

class Bus extends Vehicle {

    Bus(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Bus engine starts with air pressure system.");
    }
}