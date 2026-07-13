package VECHILE_MANAGEMENT;

class ElectricCar extends Vehicle {

    ElectricCar(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Electric car starts silently with a button.");
    }
}